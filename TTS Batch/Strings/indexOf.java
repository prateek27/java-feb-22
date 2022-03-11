package com.company;

class Main {
    public static void main(String[] args) {
        String s = "hello1234  +-world";
        System.out.println(s.indexOf('o'));
        System.out.println(s.indexOf("1234"));
        System.out.println(s.lastIndexOf('o'));

        System.out.println(s.indexOf("9876"));


    }
}