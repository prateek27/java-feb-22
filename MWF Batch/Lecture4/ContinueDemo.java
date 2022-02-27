package com.prateek;

public class ContinueDemo {
    public static void main(String[] args) {

        int i=1;
        for( ;i<=10;  ){
            System.out.println(i);
            if(i==7){
                i = i + 1;
                continue;
            }
            i = i + 2;
        }
        while(i<=10){
            System.out.println(i);
            if(i==7){
                i = i + 1;
                continue;
            }
            i = i + 2;
        }
    }
}
