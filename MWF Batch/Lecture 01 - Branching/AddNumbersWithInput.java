import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Input (1. Build a Scanner)
		Scanner sc = new Scanner(System.in); 

		// Use the Scanner 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();


		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		int sum = a + b + c;

		System.out.println("Sum is " + sum);
	}
}