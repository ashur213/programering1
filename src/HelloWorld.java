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
			System.out.println("Vad är din adress?");
			String shorba = input.nextLine();
			System.out.println("din adress är: " + shorba);
			System.out.println("vad är din postnummer?");
			String postnmr = input.nextLine();
			System.out.println("din postnummer är: " + postnmr);
			System.out.println("vilken stad bor du i?");
			String stad = input.nextLine();
			System.out.println("du bor i staden: " + stad);
			System.out.println("vad är ditt telefonnummer?");
			String telefon = input.nextLine();
			System.out.println("Ditt telefonnummer är: " + telefon);
	}

}