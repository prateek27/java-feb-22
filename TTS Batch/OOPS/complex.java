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
        x.real = 5;
        x.imaginary = 3;
//        5 + 3i
        x.print();

        ComplexNumber y = new ComplexNumber();
        y.real = 10;
        y.imaginary = -2;
//        10 + (-2)i
        y.print();
    }
}