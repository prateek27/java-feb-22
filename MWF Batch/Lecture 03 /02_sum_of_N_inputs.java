import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		//Keep the Scanner
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		//need a loop a run N times
		int i = 1;
		while(i<=n){
			// take a single input in every step
			int current_no = sc.nextInt();
			sum = sum + current_no;
			// System.out.println(current_no);
			i = i + 1;
		}
		System.out.println(sum);


	}
}