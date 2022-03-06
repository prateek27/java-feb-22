package com.prateek.arrays1;

public class PassByValue {
    public static void pesaDouble(int money){
        // 21 din me pesa double
        money = 2*money;
        System.out.println("Pesa " + money);
    }

    public static void main(String[] args) {
        int money = 100;
        System.out.println("Money " + money);
        pesaDouble(money);
        System.out.println("Money After Doubling" + money);
    }
}
