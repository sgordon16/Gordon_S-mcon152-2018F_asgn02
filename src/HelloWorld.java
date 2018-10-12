import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = kb.nextInt();
		System.out.println("Enter number 2");
		int b = kb.nextInt();
		Adder adder = new Adder(a,b);
		System.out.println(adder.add());
		kb.close();
	}

}
