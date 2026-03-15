package com.juaracoding;

// Hanya mengimport yang benar-benar digunakan
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Variabel {

    public static void main(String[] args) {
        
        // 1. Deklarasi Variabel
        short stock = 9999;
        byte minRequest = 5;
        char size = 'L';
        String path = "C:\\Users\\Lenovo\\OneDrive\\Gambar";
        String productName = "ZOTAC GAMING NVIDIA GeForce RTX 5070 SOLID OC 12GB DDR7 - BLACK";
        boolean isAvailable = true;
        boolean isVerified = false;
        boolean isActive = true;

        // 2. Menggunakan Variabel (Agar garis kuning/warning hilang)
        System.out.println("--- Informasi Produk ---");
        System.out.println("Nama Produk: " + productName);
        System.out.println("Stok: " + stock);
        System.out.println("Minimal Order: " + minRequest);
        System.out.println("Ukuran: " + size);
        System.out.println("Path Gambar: " + path);
        
        System.out.println("\n--- Status ---");
        System.out.println("Tersedia: " + isAvailable);
        System.out.println("Terverifikasi: " + isVerified);
        System.out.println("Aktif: " + isActive);

        // 3. Format Tanggal
        LocalDate tanggalLahir = LocalDate.of(2006, 12, 12);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDate = tanggalLahir.format(formatter);
        
        System.out.println("\n--- Data Tanggal ---");
        System.out.println("Tanggal Lahir: " + formatDate);
    }
}