package com.company;

class ComplexNumber {
    int real;
    int imaginary;

    //    The constructor has the same name as the class
//    The constructor does not have any return type
//    Automatically invoked/called when the object is created.
    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    void print() {
        System.out.println(real + " + " + imaginary + "i");
        System.out.println(this);
        System.out.println(this.real);
        System.out.println(this.imaginary);
    }
}

class Main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(5, 3);
//        5 + 3i
        x.print();
        System.out.println(x);

        ComplexNumber y = new ComplexNumber(10, -2);
//        10 - 2i
        y.print();

//        System.out.println(y);
    }
}