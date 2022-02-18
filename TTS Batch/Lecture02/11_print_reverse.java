import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		// Input n 
		int N = sc.nextInt();
		int sum = 0;

		while(N>0){
			System.out.print(N%10);
			N = N/10;
		}
		//System.out.println(sum);

	}
}