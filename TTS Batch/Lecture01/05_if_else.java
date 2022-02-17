import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Build a Scanner
		Scanner myScanner = new Scanner(System.in);

		// Read a Name and Say Hello Name 
		int temp = myScanner.nextInt();
		System.out.println("Temperature " + temp);

		// Conditional 
		if(temp > 25){
			System.out.println("Hot Day");
		}
		else{
			System.out.println("Pleasant Day");
		}

		System.out.println("So what's the plan!"); // always execute

	}
}