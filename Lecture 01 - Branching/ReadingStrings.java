import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Input (1. Build a Scanner)
		Scanner sc = new Scanner(System.in); 

		// Use the Scanner 
		String name = sc.nextLine();
		String college = sc.next(); //or nextLine()
		int age = sc.nextInt();
		System.out.println("Hello " + name);
		System.out.println(college);
		System.out.println(age);
	}
}