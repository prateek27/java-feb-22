package com.prateek.functions1;

import java.util.Scanner;

public class AbsoluteValue {

    public static int calcAbs(int n){
        if(n<0){
            return -n;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int ans = calcAbs(no);
        System.out.println(ans);

    }
}
