package com.juaracoding.oop;

public class BidangDatar {

    void draw(){
        System.out.println("Default draw");
    }

}

class Segitiga extends BidangDatar{

    void draw(){
        System.out.println("Gambar Segitiga");
    }

}

class Lingkaran extends BidangDatar{

    void draw(){
        System.out.println("Gambar Lingkaran");
    }

}