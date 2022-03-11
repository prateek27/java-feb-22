package com.company;

class Main {
    public static void main(String[] args) {
        String s = "hello";

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res = s.charAt(i) + res;
        }

        System.out.println(res);
    }
}