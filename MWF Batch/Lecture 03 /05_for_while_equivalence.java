import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		//Keep the Scanner
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Print Numbers 1 to N
		int i=1;
		while(i<=n){
			System.out.print(i + ",");
			i = i + 1;
		}
		System.out.println();

		// Print Numbers from 1 to N 
		int j=1;
		for(  ;j<=n;  ){
			System.out.print(j + ".");
			j = j + 1;
		}




	}
}