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
			System.out.println("Vad �r din adress?");
			String shorba = input.nextLine();
			System.out.println("din adress �r: " + shorba);
			System.out.println("vad �r din postnummer?");
			String postnmr = input.nextLine();
			System.out.println("din postnummer �r: " + postnmr);
			System.out.println("vilken stad bor du i?");
			String stad = input.nextLine();
			System.out.println("du bor i staden: " + stad);
			System.out.println("vad �r ditt telefonnummer?");
			String telefon = input.nextLine();
			System.out.println("Ditt telefonnummer �r: " + telefon);
	}

}