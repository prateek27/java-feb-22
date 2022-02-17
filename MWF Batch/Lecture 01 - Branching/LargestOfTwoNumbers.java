import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Input (1. Build a Scanner)
		Scanner sc = new Scanner(System.in); 

		// Read two numbers and print the largest number
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a>b){
			System.out.println(a);
		}
		else{
			System.out.println(b);
		}
	}
}