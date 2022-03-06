package com.prateek.arrays2;

import java.util.Arrays;

public class PassByValueInArray {

    public static void pesaDouble(int[] money){

        for(int i=0; i<money.length; i++){
            money[i] = 2*money[i];
        }
    }

    public static void main(String[] args) {
        int[] friends_money = {100,200,300};
        pesaDouble(friends_money);
        System.out.println(Arrays.toString(friends_money));
    }
    // Pass by Value (object reference is copied, because of which the orignal object got changed)

}
