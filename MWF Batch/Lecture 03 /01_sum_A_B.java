import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		// Your code goes here
		int A,B; // B >= A 
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		

		int i = A;
		while(i<=B){
			sum = sum + i; // Work
			i = i + 1; // Update 
		}

		System.out.println(sum);

	}
}