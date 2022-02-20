import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		//Keep the Scanner
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;

		//need a loop that runs b times
		for(int i=1; i<=b; i++){
			ans = ans + a;
		}
		System.out.println(ans);

	}
}