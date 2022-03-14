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

//        Reading the properties
        System.out.println(c1.color);   // Black
        System.out.println(c1.model);   // Hatchback
        System.out.println(c1.price);   // 100000

        c2.color = "Gray";
        System.out.println(c2.color);    // Gray
        System.out.println(c2.price);    // 100000

        c1.drive("Zoom zoom zoom");
        c2.drive("Shoo Shoo Shoo");

//        Calling using the objects
        c1.lock();
        c2.lock();

        c1.unlock();
        c2.unlock();

        c2 = c1;
        c2.color = "red";
        System.out.println(c1.color);
    }
}