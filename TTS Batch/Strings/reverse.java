package com.company;

class Main {
    public static void main(String[] args) {
        String s = "hello world";
        String rev = "";

        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
            System.out.println(rev);
        }

        System.out.println(rev);
    }
}