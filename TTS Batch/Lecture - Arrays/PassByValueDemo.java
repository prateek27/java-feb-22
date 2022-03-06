package com.prateek.arrays2;

public class PassByValueDemo {

    public static void pesaDouble(int pesa){
        pesa = 2*pesa;
        System.out.println("Pesa " + pesa);
    }

    public static void main(String[] args) {
        int money = 100;
        System.out.println("Before Doubling " +money);
        pesaDouble(money);
        System.out.println("Money after Doubling " + money);

    }
}
