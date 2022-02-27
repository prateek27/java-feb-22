package com.prateek.patterns2;

import java.util.Scanner;

public class NumberPatternFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int final_value = sc.nextInt();
        int val = 1;

        for(int i=1; val<=final_value ; i++){
            for(int col=1; col<=i ; col++){
                System.out.print(val + " ");
                val++;
                if(val>final_value){
                    break;
                }
            }
            System.out.println();
        }
    }
}
