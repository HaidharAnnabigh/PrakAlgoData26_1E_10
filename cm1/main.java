package cm1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);

        // isi data mahasiswa
        Mahasiswa[] mhs = {
                new Mahasiswa("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // isi data buku
        Buku[] buku = {
                new Buku("B001", "Algoritma", 2020),
                new Buku("B002", "Basis Data", 2019),
                new Buku("B003", "Pemrograman", 2021),
                new Buku("B004", "Fisika", 2024)
        };

        // isi data peminjaman
        Peminjaman[] pinjam = {
                new Peminjaman(mhs[0], buku[0], 7),
                new Peminjaman(mhs[1], buku[1], 3),
                new Peminjaman(mhs[2], buku[2], 10),
                new Peminjaman(mhs[2], buku[3], 6),
                new Peminjaman(mhs[0], buku[1], 4)
        };

        for (int i = 0; i < pinjam.length; i++) {
            pinjam[i].hitungDenda();
        }

        // menampilkan menu untuk memilih menu mana yang ingin ditampilkan
        int pilih;

        do {
            System.out.println("\n========== SISTEM PEMINJAMAN RUANG BACA JTI ==========");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4.  Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilih = haidhar.nextInt();
            haidhar.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa: ");
                    for (Mahasiswa m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Buku: ");
                    for (Buku b : buku) {
                        b.tampilBuku();
                    }
                    break;

                case 3:
                    System.out.println("\nDaftar Peminjaman: ");
                    for (Peminjaman p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 4:
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                Peminjaman temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman p : pinjam) {
                        System.out.println(p.mhs.nama + " | " + p.buku.judul + " | " + "Lama: " + p.lamaPinjam
                                + " | " + "Terlambat: " + p.terlambat + " | " + "Denda: " + p.denda);
                    }
                    break;

                case 5:
                    System.out.print("\nMasukkan NIM: ");
                    String search = haidhar.nextLine();
                    boolean find = false;

                    for (Peminjaman p : pinjam) {
                        if (p.mhs.nim.equals(search)) {
                            p.tampilPeminjaman();
                            find = true;
                        }
                    }

                    if (!find) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                default:
                    break;
            }
        } while (pilih != 0);
    }
}