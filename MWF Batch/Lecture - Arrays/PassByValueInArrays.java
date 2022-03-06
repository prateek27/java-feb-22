package com.prateek.arrays1;

import java.util.Arrays;

public class PassByValueInArrays {

    public static void pesaDouble(int[] friends_money){
        for(int i=0; i<friends_money.length; i++){
            friends_money[i] = 2*friends_money[i];
        }
    }

    public static void main(String[] args) {
        int[] friends = {100,200,300};
        System.out.println("Before Scaler" + Arrays.toString(friends));
        pesaDouble(friends);
        System.out.println("After Scaler" + Arrays.toString(friends));
    }
}
