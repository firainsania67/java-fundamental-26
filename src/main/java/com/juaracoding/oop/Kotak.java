package com.juaracoding.oop;

public class Kotak {
    int sisi;
    Kotak(int sisi){
        this.sisi = sisi;
    }

    void draw(){
        for (int i = 0; i < sisi; i++){
            for (int j = 0; j < sisi; j++){
                System.out.println(s: "*")
            }
            System.out.println();
        }
    }
    int luast (int sisi){
        return sisi*sisi;
    }
}
