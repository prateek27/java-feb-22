package com.company;

class Main {
    public static void main(String[] args) {
        String str = "I love Programming";

        // Start at index=7 and extract till the end
        String sub = str.substring(7);
        System.out.println(sub);            // "Programming"

        // Start at index=2 and extract chars till index<6
        String sub2 = str.substring(2, 6);
        System.out.println(sub2);           // "love"

//        System.out.println(str.substring(-1));
    }
}