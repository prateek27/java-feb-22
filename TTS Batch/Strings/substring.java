package com.company;

class Main {
    public static void main(String[] args) {
        String s = "hello world";

        String s2 = s.substring(3);
        System.out.println(s2);


        String s3 = s.substring(4, 7);
        System.out.println(s3);

//        System.out.println(s.substring(7, 4));    Error

    }
}