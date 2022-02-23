import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();


		// Use For Loop to Print Digits of a Number in the reverse order
		for(  ;N>0; N=N/10){
			//work 
			System.out.print(N%10);
		}
		
		//also fine!
		for(int i=N;i>0; i=i/10){
			//work 
			System.out.print(i%10);
		}
		//also fine

		
		for(  ;N>0; ){
			//work 
			System.out.print(N%10);
			N = N/10;
		}

	}
}