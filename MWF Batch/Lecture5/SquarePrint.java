package com.prateek;

import java.util.Scanner;

public class SquarePrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Loop for Rows
        for(int i=1; i<=n; i++) {
            // Work to be done in every row
            // Print N no stars in every row
            for (int stars = 1; stars <= m; stars++) {
                // System.out.print("*");
                System.out.print("("+i+","+stars+")");
            }
            // new line
            System.out.println();
        }
    }
}
