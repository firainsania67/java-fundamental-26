package com.juaracoding.oop;

public class Calculator {

    void sum(int a, int b){
        System.out.println("Hasil: " + (a + b));
    }

    void sum(int a, int b, int c){
        System.out.println("Hasil: " + (a + b + c));
    }

    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}