package com.prateek;

import java.util.Scanner;

public class PrimeCheckMultipleInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        //Need a loop that runs t times
        for(int i=1; i<=T; i++){
            int N = sc.nextInt();
            // check the no is prime
            int div;
            for(div=2; div<=N-1;){
                if(N%div==0){
                    //stop the loop as you get the first div
                    break;
                }
                div++;
            }
            // out of the  loop
            if(div==N){
                System.out.println("Prime" + N);
            }
            else{
                System.out.println("Not Prime" + N);
            }
        }
    }
}
