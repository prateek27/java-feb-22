package com.prateek;

import java.util.Scanner;

public class NumberPrint {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            // int m = sc.nextInt();

            // Loop for Rows
            for(int i=1; i<=n; i++) {
                // Work to be done in every row
                // Print numbers from 1 to M in every row
                for (int col = 1; col <= i; col++) {
                    System.out.print(col);
                    // System.out.print("("+i+","+stars+")");
                }
                // new line
                System.out.println();
            }
        }
}


