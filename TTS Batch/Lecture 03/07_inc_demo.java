import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int x = 5;
		int y = x++;
		int z = ++x;
		System.out.println(x + "," + y + "," + z);
	}
}