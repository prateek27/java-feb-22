package com.company;

class Main {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(s.indexOf('l'));  // 2
        System.out.println(s.indexOf("lo"));
        System.out.println(s.indexOf("abc"));

        System.out.println(s.lastIndexOf('l'));
    }
}