package com.juaracoding;

import java.util.Scanner;

public class Method {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // contoh method
        kotak();
        System.out.println();
        kotak();

        segitiga(5);
        System.out.println();
        segitiga(10);

        System.out.println("Luas kotak sisi 5 = " + luasKotak(5));
        System.out.println("Luas kotak sisi 10 = " + luasKotak(10));

        double[] prices = {40000, 50000, 60000};
        System.out.println("Total bayar array = " + totalBayar(prices));

        // simulasi diskon
        int qty = 2;
        int harga = 100000;
        int diskon = 10;

        double total = subtotal(qty, harga, diskon);
        System.out.println("Total bayar = " + total);

        // login aplikasi
        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        login(username, password);
    }

    // method kotak
    public static void kotak() {
        int sisi = 5;

        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // method segitiga
    public static void segitiga(int sisi) {

        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // luas kotak
    public static int luasKotak(int sisi) {
        return sisi * sisi;
    }

    // kalkulasi diskon
    public static double kalkulasiDiskon(int diskon, double harga) {
        return harga - (harga * diskon / 100);
    }

    // subtotal
    public static double subtotal(int qty, int harga, int diskon) {
        double total = qty * harga;

        if (total > 100000) {
            return kalkulasiDiskon(diskon, total);
        }

        return total;
    }

    // total bayar dari array
    public static double totalBayar(double[] prices) {

        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }

        return total;
    }

    // list product
    public static void listProduct(String[] namaProduk, double[] harga) {

        for (int i = 0; i < harga.length; i++) {
            System.out.printf("%d. %s Rp. %.2f%n", i + 1, namaProduk[i], harga[i]);
        }
    }

    // method login
    public static void login(String username, String password) {

        if (username.equals("admin") && password.equals("coding")) {
            System.out.println("Login berhasil");
            menuApp();
        } else {
            System.out.println("Login gagal");
        }
    }

    // menu aplikasi
    public static void menuApp() {

        int menu;

        do {

            System.out.println("\nDaftar Menu");
            System.out.println("1. List Produk");
            System.out.println("2. Hitung Total Harga");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            switch (menu) {

                case 1:

                    double[] prices = {40000, 50000, 60000};
                    String[] namaProduk = {"Asus", "MSI", "Colorful"};

                    listProduct(namaProduk, prices);

                    break;

                case 2:

                    double[] harga = {40000, 50000, 60000};
                    System.out.println("Total bayar = " + totalBayar(harga));

                    break;

                case 3:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (menu != 3);
    }
}