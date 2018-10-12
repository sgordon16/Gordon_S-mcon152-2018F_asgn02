import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		char choice;
		int a;
		int b;
		
		do {
			System.out.println("Enter number 1");
			a = kb.nextInt();
			System.out.println("Enter number 2");
			b = kb.nextInt();
			kb.nextLine();
			Calculater calculater = new Calculater(a, b);
			System.out.println("Do you want to (a); add or (b) subtract?");
			choice = kb.nextLine().charAt(0);
			if(choice == 'a')
				System.out.println(calculater.add());
			if(choice == 'b')
				System.out.println(calculater.subtract());
			System.out.println("Enter 'q' to quit or any other key to keep calculating");
			choice = kb.nextLine().charAt(0);
		} while(choice != 'q');
		kb.close();
	}

}
