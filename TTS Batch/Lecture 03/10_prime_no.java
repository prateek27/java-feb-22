import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// Given a N, check if it is prime
		// Idea: find atleast one div starting from 2 and less than N 
		int i;
		for(i=2; i<=N-1;i++){
			// stop as we get the first divisor
			if(N%i==0){
				System.out.println("Not prime");
				break;
			}
		}
		//out of the loop --> automatically completed
		// or it was stopped break
		if(i==N){
			System.out.println("Prime");
		}


	}
}