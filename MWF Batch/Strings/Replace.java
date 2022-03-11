package com.company;

class Main {
    public static void main(String[] args) {
        String s = "I love Programming";
//        I love Java

        String s2 = s.replace("Programming", "Java");
        System.out.println(s2);
        System.out.println(s2.length());

        System.out.println(s);
        System.out.println(s.length());

        String s3 = "hello world";
        s3 = s3.replace("hello".toLowerCase(), "HELLO");
        System.out.println(s3);
    }
}