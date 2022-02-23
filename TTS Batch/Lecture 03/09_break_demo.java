import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int gf_calls_up = 5;
		int cal;
		for(cal = 1; cal <=10; cal++){
			//you stop in the middle
			System.out.println("Burning " + cal);
				if(cal==gf_calls_up){
					break;
				}
		}
		// Print "dinner date" if gf_calls_up 
		// otherwise print "workout complete"
		if(cal==11){
			System.out.println("Workout complete");
		}
		else{
			System.out.println("Dinner Date");
		}
		System.out.println();

	}
}