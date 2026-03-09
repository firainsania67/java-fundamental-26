package com.juaracoding;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int angka[] = {1,2,3,4,5};
        System.out.println(angka[0]);

        int number[] = new int[5];
        number[0] = 80;
        number[1] = 82;
        number[2] = 84;
        number[3] = 86;
        number[4] = 88;

        System.out.println(number[4]);

        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }

        System.out.println();

        System.out.println("Foreach");
        for (int n : number){
            System.out.println(n);
        }

        String produk[] = {"asus", "zotac", "galax", "nebula"};
        for (int i = 0; i < produk.length; i++) {
            System.out.println(produk[i].toUpperCase());
        }

        int num[][] = {{1,2,3,4},{5,6,7}};
        System.out.println(num[1][2]);

        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){
                System.out.println(num[i][j]);
            }
            System.out.println();
        }

        // sort bawaan java
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        Arrays.sort(produk);
        System.out.println(Arrays.toString(produk));

        String city = "Jakarta";
        System.out.println(city.length());

        String cities[] = {"Jakarta", "Medan", "Surabaya", "Bali", "Bandung"};
        String kotaTerpanjang = "";
        int index = 0;

        for (int i = 0; i < cities.length; i++) {
            if(cities[i].length() > kotaTerpanjang.length()){
                kotaTerpanjang = cities[i];
                index = i;
            }
        }

        System.out.println(kotaTerpanjang+" index ke "+index);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data = ");
        int jualan = scanner.nextInt();

        int price[] = new int[jualan];

        for (int i = 0; i < price.length; i++){
            System.out.print("Masukkan Harga = ");
            price[i] = scanner.nextInt();
        }

        // panggil sorting
        bubbleSort(price);

        System.out.println("Hasil sorting harga:");
        System.out.println(Arrays.toString(price));

        scanner.close();
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}