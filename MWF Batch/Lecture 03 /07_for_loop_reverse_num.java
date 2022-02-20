import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		//Keep the Scanner
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		int ans = 0;
		for( ;n > 0; ){
			
			int rem = n%10;
			ans = ans*10 + rem;
			n=n/10;
		}

		System.out.println(ans);

	}
}