package com.prateek.arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] +",");
        }
    }
    public static void playWithArray(){
        int[] marks = {20,14,11,13,21};
        //marks
        // marks[5] = 50; // exception at run time (ArrayIndexOutOfBounds)

        // Print
        System.out.println(marks); //Obj Reference
        System.out.println(marks.length);

        // access a given element
        marks[0] = 22; //update the marks of 0th student
        System.out.println(marks[0]);

        // Print All the Elements - 1
        printArray(marks);

        // Print All the Elements - 2
        System.out.println();

        for(int x:marks){
            System.out.print(x + ".");
        }for(int x:marks){
            System.out.print(x + ".");
        }

        // Print All the Elements - 3
        System.out.println();
        System.out.println(Arrays.toString(marks));
    }
    // Search for an element from the array
    // return the index if present else return -1
    public static int search(int arr[],int key){

        for(int i=0;i < arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        //out of the loop

        return -1;
    }


    //Remove an element from the array
    public static void removeElement(int arr[],int idx){
        // shifting
        for(int i=idx; i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        //make the last element as 0 (bcoz it already shifted 1 position back)
        arr[arr.length-1] = 0;
        // not returning the array

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        // arr = new int[5*n];

        System.out.println(Arrays.toString(arr));

        // Accept all the inputs from the user and store it inside the array
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            // printArray(arr);
        }

        // Ask for key to search
        int key = sc.nextInt();
        System.out.println(search(arr,key));
        removeElement(arr,2);

        // Print
        printArray(arr);


    }
}
