package com.company;


class Car {
    String model = "Hatchback";
    String color = "Black";
    int price = 100000;

    void drive(String msg) {
        System.out.println(msg);
    }

    void lock() {
        System.out.println("Car is now locked");
    }

    void unlock() {
        System.out.println("Car is now unlocked");
    }

    String getDetails() {
        return color + model;
    }
}

class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c2.color = "Gray";

        System.out.println(c1.getDetails());
        System.out.println(c2.getDetails());

    }
}