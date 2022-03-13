package com.company;

class Car {
    String model = "Hatchback";
    String color = "Black";
    int price = 100000;
    boolean isLocked = true;

    void drive() {
        System.out.println("Zoom zoom zoom");
    }

    void lock() {
        System.out.println("Car is now locked");
        isLocked = true;
    }

    void unlock() {
        System.out.println("Car is now unlocked");
        isLocked = false;
    }

    String getDetails() {
        return model + " " + color + " " + price;
    }

    float getPrice() {
        return price;
    }
}

class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.lock();
        System.out.println(c1.isLocked);

        c2.unlock();
        System.out.println(c2.isLocked);
    }
}