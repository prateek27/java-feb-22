package com.prateek.functions2;

import java.util.Scanner;

public class FunctionBasic {

    public static int calcArea(int l,int b){
        int area = l*b;
        return area;
    }

    // User Input and sent it to function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calcArea(l,b));
    }

}
