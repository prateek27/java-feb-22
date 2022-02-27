package com.prateek;

import java.util.Scanner;

public class NumberIncPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;
        // Loop for Rows
        for(int i=1; i<=n; i++) {

            for (int col = 1; col <= i; col++) {
                if(col==i){
                    // no space after the last col
                    System.out.print(val);
                }
                else {
                    System.out.print(val + " ");
                }
                val++;
            }
            System.out.println();
        }
    }
}
