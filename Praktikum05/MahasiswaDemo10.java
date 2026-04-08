package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo10 {

    public static void main(String[] args) {
        Scanner haidhar = new Scanner (System.in);
        
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + i);
            System.out.print("Nama  : ");
            String nama = haidhar.nextLine();
            System.out.print("NIM   : ");
            String nim = haidhar.nextLine();
            System.out.print("IPK   : ");
            double ipk = haidhar.nextDouble();
            haidhar.nextLine();
            System.out.print("Kelas : ");
            String kelas = haidhar.nextLine();
            System.out.println("------------------------------");

            list.tambah(new Mahasiswa10(nim, nama, kelas, ipk));
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

         System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSortDesc();
        list.tampil();
    }
}