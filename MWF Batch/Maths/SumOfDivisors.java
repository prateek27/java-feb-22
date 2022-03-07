package com.prateek;

public class SumOfDivisors {
    public static void main(String[] args) {

        int n = 36;
        int sum = 0;
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                if(i*i==n){
                    sum = sum + i;
                }
                else {
                    sum = sum + i + n / i;
                }
            }
        }
        System.out.println(sum);
    }
}
