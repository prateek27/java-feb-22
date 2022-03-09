package com.company;

class Main {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";

        String c = a + " " + b;
        System.out.println(c);
//        System.out.println(a + b);

        System.out.println("hello" + 5);
        String d = "abc" + 3.4;
        System.out.println(d);
        System.out.println("xyz" + 'c');
        System.out.println("xyz" + true);

    }
}