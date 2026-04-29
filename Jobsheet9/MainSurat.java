package Jobsheet9;

import java.util.Scanner;
 
public class MainSurat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat stackSurat = new StackSurat(10);
        int pilihan;

        do {
            System.out.println("\n===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n-- Terima Surat Izin --");
                    System.out.print("ID Surat       : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S=Sakit / I=Izin): ");
                    char jenisIzin = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat10 surat = new Surat10(id, nama, kelas, jenisIzin, durasi);
                    stackSurat.push(surat);
                    System.out.println("Surat berhasil diterima.");
                    break;

                case 2:
                    System.out.println("\n-- Proses Surat Izin --");
                    Surat10 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Surat sedang diverifikasi:");
                        System.out.println("ID Surat     : " + diproses.idSurat);
                        System.out.println("Nama         : " + diproses.namaMahasiswa);
                        System.out.println("Kelas        : " + diproses.kelas);
                        System.out.println("Jenis Izin   : " + (diproses.jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
                        System.out.println("Durasi       : " + diproses.durasi + " hari");
                        System.out.println("Status       : Surat telah diverifikasi.");
                    }
                    break;

                case 3:
                    System.out.println("\n-- Lihat Surat Izin Terakhir --");
                    Surat10 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("ID Surat     : " + terakhir.idSurat);
                        System.out.println("Nama         : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas        : " + terakhir.kelas);
                        System.out.println("Jenis Izin   : " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
                        System.out.println("Durasi       : " + terakhir.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.println("\n-- Cari Surat --");
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    stackSurat.cariSurat(cari);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}