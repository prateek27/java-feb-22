package com.company;

class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
//        sb.append("ok ");
//        sb.append("b ye");

        System.out.println(sb);

        sb.insert(2, "+");

        System.out.println(sb);

        sb.replace(2, 8, "Java");

        System.out.println(sb);
    }
}