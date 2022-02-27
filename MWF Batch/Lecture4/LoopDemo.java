package com.prateek;

public class LoopDemo {
    public static void main(String[] args) {

        int cal=0;
        int mom_calls_up = 5;

        for( ;cal<=50; cal++){
            if(mom_calls_up==cal){
                break;
            }
            System.out.println("Running "+cal);
        }


        if(cal==51) {
            System.out.println("Workout complete " + cal);
        }
        else{
            System.out.println("Going back home");
        }
    }
}
