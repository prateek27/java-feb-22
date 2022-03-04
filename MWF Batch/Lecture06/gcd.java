class Main {
	public static void main(String args[]) {
		// Your code goes here
		int a = 2;
		int b = 0;
		int a_, b_;

		while(a > 0){
			a_ = b%a;
			b_ = a;
			a = a_;
			b = b_;
		}
		System.out.println(b);
	}
}