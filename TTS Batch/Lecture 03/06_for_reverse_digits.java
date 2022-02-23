import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int ans = 0;
		// Use For Loop to rev teh no
		for(  ;N!=0; N=N/10){
			//work 
			ans = ans*10 + N%10;
		}
		System.out.println(ans);

	}
}