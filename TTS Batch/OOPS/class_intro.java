package com.company;

import java.util.Scanner;

class Car {
    String model = "Hatchback";
    String color = "Black";
    int price = 100000;

    void drive() {
        System.out.println("Zoom zoom zoom");
    }

    void lock() {
        System.out.println("Car is now locked");
    }

    void unlock() {
        System.out.println("Car is now unlocked");
    }

    String getDetails() {
        return model + color;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();
        Car c2 = new Car();

//        Reading the properties
//        System.out.println(c1.color);   // Black
//        System.out.println(c1.model);   // Hatchback
//        System.out.println(c1.price);   // 100000

        c2.color = "Gray";
//        System.out.println(c2.color);    // Gray

//        c1.drive();
//        c2.drive();
//
//        c1.lock();
//        c2.lock();
//
//        c1.unlock();
//        c2.unlock();

        System.out.println(c1.getDetails());
        System.out.println(c2.getDetails());
    }
}