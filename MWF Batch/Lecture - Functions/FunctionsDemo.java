package com.prateek.functions1;

public class FunctionsDemo {

    public static void bringVeggies(int weight, String vegetable){
        System.out.println("Bringing " + weight + "Kg of " + vegetable);

    }

    public static int shopForGrocery(int weight, String item,int money){
        int money_left;
        System.out.println("Bringing " + weight + "Kg of " + item);
        int item_cost = 12; //per kg
        money_left = money - item_cost*weight;
        money_left = 100;
        return money_left;
    }

    public static void main(String[] args) {
        /*bringVeggies(5,"Tomato");
        bringVeggies(2,"Carrot");
        bringVeggies(3,"Apples");*/
        int moneySaved = shopForGrocery(5,"Almonds",100);
        System.out.println("Final remaining amount" + moneySaved);



    }
}
