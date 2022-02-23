import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);

		// Read A, B
		int A = sc.nextInt();
		int B = sc.nextInt();

		int i=1;
		int prod = 0; 
		while(i<=B){
			prod = prod + A; // Adding A, B times  
			i++; // Update
		}
		System.out.println(prod);
	}
}