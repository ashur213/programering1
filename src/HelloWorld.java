import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
				

			
			System.out.println("vad är ditt användanamn?");
			String name = input.nextLine();
			System.out.println("ditt användanamn är: " + name);
			System.out.println("Hur gammal är du?");
			String age = input.nextLine();
			System.out.println("Din ålder är: " + age);
	}

}