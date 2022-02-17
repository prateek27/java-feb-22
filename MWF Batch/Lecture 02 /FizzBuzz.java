import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		//BUild a Scanner
		Scanner sc = new Scanner(System.in);
		//Read a Number 1 ... Number
		int number = sc.nextInt();
		int N = 1;
		while(N<=number){
			if(N%3==0 && N%5==0){ // or if(N%15==0)
			System.out.println("FizzBuzz");
			}
			else if(N%5==0){
				System.out.println("Buzz");
			}
			else if(N%3==0){
				System.out.println("Fizz");
			}
			else{
				System.out.println(N);
			}
			N = N + 1;
		}
	}
}