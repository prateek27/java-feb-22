package com.company;

class Main {
    public static void main(String[] args) {
        String s = "Hello World";

//        s2 contains a copy of s, with all lowercase chars
        String s2 = s.toLowerCase();
        System.out.println(s2);

//        s3 contains a copy of s, with all uppercase chars
        String s3 = s.toUpperCase();
        System.out.println(s3);

        System.out.println(s);

        System.out.println(s.toLowerCase().contains("hEllo worLd".toLowerCase()));

        String personName = "taRUN luTHra is a faculty";
        System.out.println(personName.toLowerCase().contains("tarun"));

    }
}