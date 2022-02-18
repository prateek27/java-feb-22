import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		// Input n 
		int N = sc.nextInt();
		int i = N;
		while(i>=1){
			System.out.print(i+",");
			i = i - 1;
		}
	}
}