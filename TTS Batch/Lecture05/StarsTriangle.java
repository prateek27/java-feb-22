package com.prateek.patterns2;

import java.util.Scanner;

public class StarsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();

        //Print
        for(int i=1; i<=n; i++){
            //work to be done in each row
            // System.out.print("Row " + i +"--> ");

            for(int stars=1; stars<=i; stars++){
                System.out.print("*");
                // System.out.print(stars +",");
            }
            System.out.println();
        }
    }
}
