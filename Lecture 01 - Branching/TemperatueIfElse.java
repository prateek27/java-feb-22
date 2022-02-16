import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Input (1. Build a Scanner)
		Scanner sc = new Scanner(System.in); 

		// Use the Scanner 
		int temperature = sc.nextInt();

		if(temperature > 25){
			System.out.println("Hot Day today");
		}
		else{
			System.out.println("Its a pleasant Day");
		}
		
		System.out.println("Lets go out"); //Always execute
	}
}