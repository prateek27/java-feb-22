package com.prateek.patterns2;

import java.util.Scanner;

public class NumberPatternFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            // Spaces
            for(int cnt=1; cnt<=n-i; cnt++){
                System.out.print(" ");
            }
            // Inc
            int val = i;
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val);
                val++;
            }
            // System.out.print(" After Loop Val is : " + val);
            // Dec
            val = val - 2;
            for(int cnt=1; cnt<=i-1; cnt++){
                System.out.print(val);
                val--;
            }



            // newline
            System.out.println();


        }
    }
}
