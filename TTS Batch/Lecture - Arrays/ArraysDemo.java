package com.prateek.arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void playWithArray(){
        // 1. Hardcoded Array
        int[] marks = {10,20,35,60,80};

        System.out.println(marks);
        System.out.println(marks.length);

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);

        // Loop 0 to Length-1
        for(int i=0; i <= marks.length-1; i++){
            System.out.print(marks[i] + ",");
        }
        System.out.println();
        // For Each Loop (Java)
        for(int x : marks){
            System.out.print(x + ".");
        }
        System.out.println();
        // Arrays.toString()
        System.out.println(Arrays.toString(marks));
    }
    public static void printArray(int[] arr){
        for(int i=0; i <= arr.length-1; i++){
            System.out.print(arr[i] + ",");
        }
    }

    // find the index of key in arr, return -1 if key is not present
    public static int search(int[] arr,int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        //element not present
        return -1;
    }

    public static int largestInArray(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int x : arr){
            if(x>largest){
                largest = x;
            }
        }
        return largest;

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // playWithArray();
        int[] arr = new int[n];


        // System.out.println(arr);
        // System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<= n-1; i++){
            arr[i] = sc.nextInt();
            // System.out.println(Arrays.toString(arr));
        }
        System.out.println(largestInArray(arr));

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        printArray(arr);

        /*
        int key = sc.nextInt();
        System.out.println(search(arr,key));
        */


        /*
        for(int x:arr){
            System.out.println(x);
        }*/


        /* Expand = Create a new array
        arr = new int[2*n];
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
         */
    }
}
