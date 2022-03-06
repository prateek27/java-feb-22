package com.prateek.functions2;

import java.util.Scanner;

public class VeggieHelper {

    public static void bringVeggies(int qty, String itemname){
        System.out.println("Bringing " + qty + "kg of " + itemname);
    }
    public static int shopForGrocery(int qty, String itemname,int money){
        System.out.println("Bringing " + qty + "kg of " + itemname);
        int unit_price = 12;
        int money_left = money - qty*unit_price;
        return money_left;
    }

    //Scope Demo
    public static void goToMarket(){
        int stalls = 10;
        int money = 0;
        if(stalls>10){
            money = 20;
        }
        System.out.println(money);
    }
    //Doubt-1 return a scanner
    public static Scanner getMeAScanner(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    // doubt-2 return an float inside int
    public static int getMeAInt(){
        float num = 3.124f;
        return (int)num;
    }


    public static void main(String[] args) {

        //bringVeggies(5, "Tomato");
        //bringVeggies(7, "Potato");

        int remMoney = shopForGrocery(7, "Sugar",100);
        System.out.println(remMoney);
        // System.out.println(money_left);

    }
}
