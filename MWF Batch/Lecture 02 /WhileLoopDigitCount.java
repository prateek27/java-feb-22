import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		//BUild a Scanner
		Scanner sc = new Scanner(System.in);
		//Count Digits in a Number
		int N = sc.nextInt();
		int digits = 0;
		if(N==0){
			System.out.println(1);
		}
		else{
			while(N != 0){
				digits = digits + 1;
				N = N/10;
			}
			System.out.println(digits);
		}
		
	}
}