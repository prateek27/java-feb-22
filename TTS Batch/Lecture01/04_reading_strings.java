import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Build a Scanner
		Scanner myScanner = new Scanner(System.in);

		// Read a Name and Say Hello Name 
		// next() --> word nextLine() --> EntireLine
		String name = myScanner.nextLine();
		int age = myScanner.nextInt();
		String tshirt_color = myScanner.next();

		System.out.println("Hello " + name);
		System.out.println(age);
		System.out.println("Color : " + tshirt_color);
	}
}