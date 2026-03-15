package com.juaracoding;

import java.util.Random;
import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {
        
        // 1. Hapus if(false) karena itu 'Dead Code' (Penyebab garis kuning utama)
        System.out.println("Next Statement");

        int bilangan = 11;
        if (bilangan % 2 == 1) {
            System.out.println(bilangan + " adalah Bilangan Ganjil");
        } else {
            System.out.println(bilangan + " adalah Bilangan Genap");
        }

        int count = 0;
        int minRequest = 1;
        int stock = 9;

        if (count > stock) {
            System.out.println("Jumlah order melebihi stok yang tersedia");
        } else if (count < minRequest) {
            System.out.println("Jumlah order tidak boleh kurang dari " + minRequest);
        } else {
            System.out.println("tombol keranjang clickable");
        }

        // 2. Gunakan variabel 'total' agar tidak dianggap 'Unused Variable'
        int total = 100000;
        if (total >= 100000) {
            System.out.println("Anda mendapatkan diskon 10%");
        }
        
        Random random = new Random(); 
        int otpValue = 100000 + random.nextInt(900000); 
        System.out.println("OTP Generator: " + otpValue);   
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silahkan input otp = "); // Gunakan print agar lebih rapi
        int inputOtp = scanner.nextInt();
        
        if (inputOtp == otpValue) {
            System.out.println("Verifikasi berhasil");
        } else {
            System.out.println("OTP tidak valid");
        }

        String email = "juaracoding@gmail.com";
        System.out.println("Email valid: " + email.equalsIgnoreCase("Juaracoding@gmail.com"));

        System.out.println("\nMain Menu: ");
        System.out.println("1. Cek saldo");
        System.out.println("2. Deposit");
        System.out.println("3. Tarik tunai");
        System.out.println("4. Exit");
        System.out.print("Silahkan pilih menu [1-4]: ");
        
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Cek saldo");
                break;
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("Tarik tunai");
                break;
            case 4:
                // Jangan gunakan System.exit(0) di sini agar scanner bisa ditutup di bawah
                System.out.println("Keluar...");
                break;
            default:
                System.out.println("Tidak pilihan menu tersebut");
                break;
        }

        String attrType = "password";
        String iconEye = attrType.equals("password") ? "Hide Password" : "Show Password";
        System.out.println("Status: " + iconEye);

        // 3. TUTUP SCANNER (Penting untuk menghilangkan warning 'Resource leak')
        scanner.close();
    }
}