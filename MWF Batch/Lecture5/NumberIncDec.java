package com.prateek;

import java.util.Scanner;

public class NumberIncDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        for(int i=1; i<=n; i++){
            // spaces
            for(int cnt=1; cnt<=n-i; cnt++){
                System.out.print(" ");
            }
            // inc
            int val = i;
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val);
                val++;
            }
           // System.out.print("Value after Inc part " + val);

            // dec
            val = val - 2;
            for(int cnt=1; cnt<=i-1; cnt++){
                System.out.print(val);
                val = val - 1;
            }
            //newline
            System.out.println();
        }

    }
}
