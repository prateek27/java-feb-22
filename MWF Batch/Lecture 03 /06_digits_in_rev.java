import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		//Keep the Scanner
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Given a Number we want to reverse it 
		
		/*
		while(n>0){
			System.out.print(n%10);
			n = n/10;
		}
		*/
		

		for( ; n>0; n=n/10){
			System.out.print(n%10);
		}

		/*
		for(int i=n; i>0; i=i/10){
			System.out.print(i%10);
		}
		*/
	}
}