import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayDemo {

    public static void playWith2DArray(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Create the array
        int[][] arr = new int[r][c];

        // Print the Data
        // System.out.println(arr); //arr
        // System.out.println(arr[0]); // first row addres

        int rows = arr.length; // r

        int cols = arr[0].length; // c

        // System.out.println(Arrays.toString(arr));
        // Print all elements of the array
        for(int i=0; i<rows; i++){
            //print the ith row
            // go to every element of the ith row
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Print all elements of the array
        for(int i=0; i<rows; i++){
            //print the ith row
            // System.out.println(arr[i]);
            // System.out.println(Arrays.toString(arr[i]));
        }
        // Print all elements of the array
        for(int i=0; i<rows; i++){
            //print the ith row
            // go to every element of the ith row
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void print2DArray(int[][] arr){

        for(int i=0; i<arr.length; i++){
            // iterate over cols in the ith row
            int cols = arr[i].length;
            // System.out.println(Arrays.toString(arr[i]));
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            //new line
            System.out.println();
        }
    }
    public static void playWithArrayVariableSize(){
        // 2D Array with hardcoded values
        int[][] arr = {{10,20,30},
                {40,50,60,70},
                {80,90}};

        System.out.println(arr.length); //3 objects (rows)
        System.out.println(arr[0].length); // 3
        System.out.println(arr[1].length); // 4
        System.out.println(arr[2].length); // 2
        print2DArray(arr);
    }

    public static void main(String[] args) {

        // create an array without telling the no of cols in every row
        // cols would be an input later
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<rows; i++){
            System.out.println("Cols in "+i+" row");
            int cols = sc.nextInt();
            // first create array for ith row
            arr[i]  = new int[cols];
            // once array is created, read it
            // read ith row
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr[i]));

        }
        // print
        print2DArray(arr);
    }
}