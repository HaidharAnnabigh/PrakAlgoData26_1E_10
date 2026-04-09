package jobsheet6;
import java.util.Scanner;

public class MahasiswaDemo10 {

    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumMhs = haidhar.nextInt();
        haidhar.nextLine();
        System.out.println("----------------------------------");
        
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();
        list.listMhs = new Mahasiswa10[jumMhs];

        for (int i = 1; i <= jumMhs; i++) {
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

        list.tampil();

        // System.out.println("--------------------------------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("--------------------------------------------------");
        // System.out.println("masukkan ipk mahasiswa yang dicari: ");
        // System.out.print("IPK: ");
        // double cari = haidhar.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // int pss = list.sequentialSearching(cari);

        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = haidhar.nextDouble();

        System.out.println("----------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------------------------");

        int pss2 = list.findBinarySearch(cari, 0, jumMhs - 1);

        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        // System.out.println("\nData mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
        // ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT
        // (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT
        // (ASC)");
        // list.insertionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT
        // (DESC)");
        // list.insertionSortDesc();
        // list.tampil();
    }
}