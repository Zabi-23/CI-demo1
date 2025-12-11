//Calculator.java
package com.example.cidemo1;

public class Calculator {

    public int add(int a, int b) {
        return a +b;
    }

    public int subtract(int a, int b) {
        return a - b;

    }

    public int divide(int a, int b) {
        if (b== 0 ) {
            throw new IllegalArgumentException("Divide cannot be zero");
        }
        return a/b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int number) {
        return number * number;
    }

    public int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}
