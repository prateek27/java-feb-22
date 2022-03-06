package com.prateek.functions1;

import java.util.Scanner;

public class Prime {

    //Checks if a Number is Prime or Not
    public static boolean isPrime(int n){
        // separate check for 1

        // Look for a div in range 2 ... n-1
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //print all primes in the range A to B
    public static void printPrimes(int a,int b){
        for(int n=a; n<=b; n++){
            if(isPrime(n)){
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printPrimes(a,b);


        /*
        int no = sc.nextInt();

        boolean res = isPrime(no);
        if(res){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

        */

    }
}
