package Pertemuan12;

import java.util.Scanner;

public class MainQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        QueueLinkedList antrian = new QueueLinkedList(kapasitas);

        int pilih;

        do {
            System.out.println("\n===== MENU ANTRIAN =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh!");
                    } else {
                        System.out.print("NIM   : ");
                        String nim = sc.nextLine();

                        System.out.print("Nama  : ");
                        String nama = sc.nextLine();

                        System.out.print("Prodi : ");
                        String prodi = sc.nextLine();

                        Mahasiswa mhs = new Mahasiswa(nim, nama, prodi);

                        antrian.enqueue(mhs);
                    }
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    antrian.peekFront();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);

        sc.close();
    }
}