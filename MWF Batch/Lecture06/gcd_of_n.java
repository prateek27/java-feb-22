import java.util.Scanner;
class Main {
	public static int gcd(int a,int b){
		int a_, b_;

		while(a > 0){
			a_ = b%a;
			b_ = a;
			a = a_;
			b = b_;
		}
		return b;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i=1; i<=n; i++){
			int num = sc.nextInt();
			ans = gcd(ans,num);
		}
		System.out.println(ans);


	}
}