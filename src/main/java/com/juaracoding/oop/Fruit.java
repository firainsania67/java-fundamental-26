package com.juaracoding.oop;

public class Fruit {

    public int grams;
    public int calsPerGram;

    public int totalCalories(){
        return grams * calsPerGram;
    }

}