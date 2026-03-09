package com.juaracoding;

import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args){

        // for 0 - 9
        System.out.println("Perulangan 0 - 9");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // 1 3 5 7 9
        System.out.println("\nBilangan ganjil");
        for (int i = 1; i < 10; i += 2){
            System.out.println(i);
        }

        // kotak
        System.out.println("\nKotak");
        int sisi = 10;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // segitiga
        System.out.println("\nSegitiga");
        int tinggi = 5;
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // segitiga terbalik
        System.out.println("\nSegitiga Terbalik");
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // while
        System.out.println("\nWhile Loop");
        int x = 0;
        while (x < sisi) {
            System.out.println(x);
            x++;
        }

        // do while
        System.out.println("\nDo While");
        int y = 0;
        do{
            System.out.println(y);
            y++;
        } while (y < 1);

        Scanner scanner = new Scanner(System.in);

        // menjumlahkan angka sampai input 100
        System.out.println("\nPenjumlahan angka (berhenti jika input 100)");
        int sum = 0;

        while (true) {
            System.out.print("Silahkan input angka: ");
            int angka = scanner.nextInt();

            if (angka == 100) {
                break;
            }

            sum += angka;
        }

        System.out.println("Total = " + sum);

        // login gagal 3x
        System.out.println("\nLogin System");

        int batas = 3;
        boolean isBlocked = true;

        while (batas > 0) {

            System.out.print("Masukan username: ");
            String username = scanner.next();

            System.out.print("Masukan password: ");
            String password = scanner.next();

            if (username.equals("admin") && password.equals("Indonesia")) {
                System.out.println("Berhasil login");
                isBlocked = false;
                break;
            } else {
                batas--;
                System.out.println("Login gagal, sisa percobaan: " + batas);
            }
        }

        if(isBlocked){
            System.out.println("Akun terblokir sementara, hubungi CS");
        }

        scanner.close();
    }
}