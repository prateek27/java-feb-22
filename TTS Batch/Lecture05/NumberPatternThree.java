package com.prateek.patterns2;

import java.util.Scanner;

public class NumberPatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;

        for(int i=1; i<=n; i++){
            for(int col=1; col<=i; col++){
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }
}
