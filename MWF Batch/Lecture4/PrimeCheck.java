package com.prateek;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int div;
        // Handle case for 1 and 0 separately

        for(div=2; div<=N-1;){
            if(N%div==0){
                //stop the loop as you get the first div
                 break;
            }
            div++;
        }
        // out of the  loop
        if(div==N){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
