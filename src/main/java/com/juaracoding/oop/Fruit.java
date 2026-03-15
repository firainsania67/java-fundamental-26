package com.juaracoding.oop;

public class Fruit {
    // Tambahkan public di sini
    public int grams;
    public int calsPerGram;

    // Tambahkan public di sini
    public int totalCalories() {
        return grams * calsPerGram;
    }
}