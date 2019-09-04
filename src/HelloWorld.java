import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Ashur");
			Scanner input = new Scanner(System.in);
				
			input.nextLine();
			
			System.out.println("vad är ditt användanamn");
			String name = input.nextLine();
			System.out.println("ditt användanamn är: " + name);
			
	}

}