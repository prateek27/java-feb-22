package com.prateek.functions2;

import java.util.Scanner;

public class PrimePractice {

    //LIVE HW
    public static boolean isPrime(int n){
        // todo: 1
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int A,int B){
        // todo: 2
        for(int n=A; n<=B; n++){
            if(isPrime(n)){
                System.out.println(n);
            }
        }
    }



    public static void main(String[] args) {
        //take input n, a, b
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        printPrimes(A,B);

        // fn calls
        /*
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }*/

    }
}
