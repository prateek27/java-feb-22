import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		int i;
		// Read N
		int N = sc.nextInt();
		// For Loop
		for(i=1; i<=N; i=i+1){
			System.out.println(i);
		}
		// Print numbers N to 1
		for(int j=N;j>0; j = j-1){
			System.out.println(j);
		}
		System.out.println("Out of the loop" + i);

	
	}
}