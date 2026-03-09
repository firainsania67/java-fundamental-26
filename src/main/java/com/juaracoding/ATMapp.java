package com.juaracoding;

import java.util.Scanner;

public class ATMapp {
    
    static double saldo = 1000000;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        if (login()) {
            menu();
        } else {
            System.out.println("Login gagal. Program berhenti.");
        }

    }

    // method login
    public static boolean login() {
        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals("fira") && password.equals("6703")) {
            System.out.println("Login berhasil\n");
            return true;
        }
        return false;
    }

    // menu ATM
    public static void menu() {
        int pilihan;

        do {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    setor();
                    break;
                case 3:
                    tarik();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 4);
    }

    // method cek saldo
    public static void cekSaldo() {
        System.out.println("Saldo Anda: Rp " + saldo);
    }

    // method setor tunai
    public static void setor() {
        System.out.print("Masukkan jumlah setor: ");
        double jumlah = scanner.nextDouble();

        saldo += jumlah;

        System.out.println("Setor berhasil.");
        System.out.println("Saldo sekarang: Rp " + saldo);
    }

    // method tarik tunai
    public static void tarik() {
        System.out.print("Masukkan jumlah tarik: ");
        double jumlah = scanner.nextDouble();

        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup!");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik tunai berhasil.");
            System.out.println("Saldo sekarang: Rp " + saldo);
        }
    }
}
