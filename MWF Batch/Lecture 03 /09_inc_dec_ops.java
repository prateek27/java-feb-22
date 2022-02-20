import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		//Keep the Scanner
		// Scanner sc = new Scanner(System.in);
		int x = 10;
		int y = x--;  //post dec
		int z = --x;  //predec 

		System.out.print(x + "," + y +"," + z);


	}
}