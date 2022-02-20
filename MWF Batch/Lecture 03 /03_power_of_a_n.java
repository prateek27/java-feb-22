import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		//Keep the Scanner
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int ans = 1;
		int i = 0;

		while(i<n){
			ans = ans * a;
			// System.out.println(ans);
			i = i + 1;
		}

		System.out.println(ans);


	}
}