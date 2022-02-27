package com.prateek.patterns2;

import java.util.Scanner;

public class ZeroOneToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val;
        for(int i=1; i<=n; i++){
            // every row
            val = i%2;
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val);
                val = 1 - val;
            }
            //newline
            System.out.println();
        }
    }
}
