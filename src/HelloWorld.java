import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
				

			
			System.out.println("vad �r ditt anv�ndanamn?");
			String name = input.nextLine();
			System.out.println("ditt anv�ndanamn �r: " + name);
			System.out.println("Hur gammal �r du?");
			String age = input.nextLine();
			System.out.println("Din �lder �r: " + age);
	}

}