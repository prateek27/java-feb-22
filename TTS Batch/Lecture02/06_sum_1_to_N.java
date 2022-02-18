import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		// Input n 
		int N = sc.nextInt();

		int i=1; //Init 
		int sum = 0;  // Sum should init 0

		while(i<=N){ // stop when i becomes N + 1
			sum = sum +i; // work
			i = i + 1; // update
		}
	
		System.out.println(sum);

	}
}