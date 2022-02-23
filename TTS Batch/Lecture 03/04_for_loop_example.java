import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
	
		// Read N
		int N = sc.nextInt();
		// For Loop
		int i=1;
		for( ; ; ){
			if(i==N+1){
				break;
			}
			System.out.println(i);
			i = i + 1;
		}

	
	}
}