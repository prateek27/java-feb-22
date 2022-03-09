package com.company;

class Main {
    public static void main(String[] args) {
        String s = "Hello World123";

//        lowercase
//        toLowerCase() generates a copy. It does not modify the original string.

        String s2 = s.toLowerCase();
        System.out.println(s2);

        System.out.println(s);

        String s3 = s.toUpperCase();
        System.out.println(s3);
        System.out.println(s);


    }
}