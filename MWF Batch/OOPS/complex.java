package com.company;

class ComplexNumber {
    int real;
    int imaginary;

    void print() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

class Main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber();
//        5 + 3i
        x.real = 5;
        x.imaginary = 3;

        x.print();

        ComplexNumber y = new ComplexNumber();
//        10 - 2i
        y.real = 10;
        y.imaginary = -2;

        y.print();

    }
}