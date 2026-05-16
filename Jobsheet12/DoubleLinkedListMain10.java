package Jobsheet12;

import java.util.List;
import java.util.Scanner;

public class DoubleLinkedListMain10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList10 list = new DoubleLinkedList10();

        int pilih;
        do {
            System.out.println("\n=== MENU DOUBLE LINKED LIST ===");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisip data ditengah (Setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    Mahasiswa10 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa10 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("Masukkan NIM yag dicari: ");
                    String keyNIM = scan.nextLine();

                    System.out.println("Masukkan data baru: ");
                    Mahasiswa10 dataBaru = inputMahasiswa(scan);

                    list.insertAfter(keyNIM, dataBaru); 
                    break;

                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilih != 0);

        scan.close();
    }

    static Mahasiswa10 inputMahasiswa(Scanner sc) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Kelas : ");
        String kelas = sc.nextLine();

        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa10(nim, nama, kelas, ipk);
    }
}