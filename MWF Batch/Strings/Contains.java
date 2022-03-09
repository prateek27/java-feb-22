package com.company;

class Main {
    public static void main(String[] args) {
        String s = "hello world";

        System.out.println(s.contains("hello"));
        System.out.println(s.contains("abc"));
        System.out.println(s.contains("hel"));
        System.out.println(s.contains(" "));
    }
}