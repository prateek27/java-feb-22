package com.prateek.patterns2;

import java.util.Scanner;

public class NumberPatternTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            //in every row, i have n cols 1...n
            for(int col=1; col<=i; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
