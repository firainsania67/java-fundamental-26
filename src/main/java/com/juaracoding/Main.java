package com.juaracoding;

import com.juaracoding.oop.Fruit;

public class Main {

    public static void main(String[] args) {

        int angka = 10;

        System.out.println("Hello World!");

        if(true){
            System.out.println("Scope IF");
            System.out.println(angka);
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Scope FOR");
            System.out.println(angka);
        }
        Fruit apple = new Fruit();
        apple.grams = 1500/100;
        apple.calsPerGram = 52;
        System.out.println(apple.totalCalories());
    }
}