

// FileName should be same as className ()
// Java Program (JDK)
// 1. Build (Compiler to Byte Code .class)     : javac  filename.java
// 2. Run your byte code using JVM (Java Virtual Machine) : java  filename

import java.util.Scanner;

class JavaDemo{
	// Input through command line
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		System.out.println("Hello ...." + args[0] + args[1]);	

	}

}