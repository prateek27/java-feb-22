import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		// Input n 
		int N = sc.nextInt();
		
		int i=1;
		int sum = 0;  // Sum should init 0

		while(i<=N){ // stop when i becomes N + 1
			int current_no = sc.nextInt();
			sum = sum + current_no;
			i = i + 1;
		}
	
		System.out.println(sum);

	}
}