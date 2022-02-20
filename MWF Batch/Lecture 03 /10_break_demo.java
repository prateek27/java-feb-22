import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		//Keep the Scanner
		// Scanner sc = new Scanner(System.in);

		int calories = 0;
		int gf_calls_up = 5;

		while(calories<=20){
			System.out.println("Burning calories " + calories);
			if(calories==gf_calls_up){
				break;
			}
			calories = calories + 1;
		}

		System.out.println("out of gym");
	}
}