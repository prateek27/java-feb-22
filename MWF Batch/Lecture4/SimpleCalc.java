package com.prateek;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String op = sc.next();
        int B = sc.nextInt();

        switch (op){
            case "+" :
                System.out.println(A+B); break;
            case "-":
                System.out.println(A-B); break;
            case "*":
                System.out.println(A*B); break;
            default:
                System.out.println("Enter valid input");
        }

    }
}

