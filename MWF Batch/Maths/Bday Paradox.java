package com.prateek;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int people = 0;
        double confidence = 1; //100%


        // solving for different bday
        // diffbday + samebday = 1
        // diffbday = 1 - samebday
        double sameBday = 0.50;
        double diffBday = 1 - sameBday;
        double num = 365;
        double denom = 365;

        while(confidence >= diffBday){

            confidence = confidence * (num-people)/denom;
            people++;
            System.out.println("People " + people + " Confidence " + confidence);

        }
        System.out.println(people);
    }
}
