import java.util.Scanner;

public class Timeloop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String b = " Abracadabra";

		if (n >= 1 && n <= 1000000) {

			for (int i = 1; i <= n; i++)
				System.out.println(i + b);
		}
	}

}