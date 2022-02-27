package com.prateek;

import java.util.Scanner;

public class StarPatternPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // Spaces
            for(int cnt=1; cnt<=n-i; cnt++){
                System.out.print(" ");
            }
            // Stars
            for (int cnt=1; cnt<=2*i-1; cnt++){
                System.out.print("*");
            }
            // newline
            System.out.println();

        }

    }
}
