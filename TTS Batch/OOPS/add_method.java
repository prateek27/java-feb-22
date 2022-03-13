package com.company;

class ComplexNumber {
    int real = 0;
    int imaginary = 0;

    //    Same name as the class
//    No return type
//    Called automatically when object is created.
    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void print() {
        System.out.println(this);
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    ComplexNumber add(ComplexNumber y) {
        int sumOfReal = this.real + y.real;
        int sumOfImag = this.imaginary + y.imaginary;
        ComplexNumber result = new ComplexNumber(sumOfReal, sumOfImag);
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(5, 3);
//        5 + 3i
        x.print();
//
        ComplexNumber y = new ComplexNumber(10, -2);
//        10 + (-2)i
        y.print();

        ComplexNumber z = x.add(y); // y.add(x);
        z.print();

    }
}