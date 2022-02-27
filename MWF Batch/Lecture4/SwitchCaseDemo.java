package com.prateek;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        
        if(day==1){
            
        }
        else if(day==2) {

        }
        switch(day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); ;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            default:
                System.out.println("Enter between 1-5");
        }
        
        
        
    }
}
