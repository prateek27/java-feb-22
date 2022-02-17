import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		//BUild a Scanner
		Scanner sc = new Scanner(System.in);
		//Count Digits in a Number
		int N = sc.nextInt();
		
		int sum = 0;
		while(N!=0){
			sum = sum + N%10;
			N = N/10;
		}
		if(sum<0){
			sum = -sum;
		}
		System.out.println(sum);
	}
}