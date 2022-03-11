package com.company;

class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        s2 = s2 + "def";
        System.out.println(s2);  // abcdef
        System.out.println(s1);  // abc
    }
}