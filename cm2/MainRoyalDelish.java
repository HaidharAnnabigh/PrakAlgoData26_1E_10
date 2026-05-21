package cm2;
import java.util.Scanner;

public class MainRoyalDelish {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoubleLinkedListPembeli10 dllPembeli = new DoubleLinkedListPembeli10();
        DoubleLinkedListPesanan10 dllPesanan = new DoubleLinkedListPesanan10();

        dllPembeli.tambahAntrian("Ainra", "08224500000");
        dllPembeli.tambahAntrian("Danra","08224511111");
        dllPembeli.tambahAntrian("Sanri","08224522222");
        
        int pilih;
                
        do {

            System.out.println("\n========================================");
            System.out.println(" SISTEM INFORMASI RESTORAN ROYAL DELISH ");
            System.out.println("========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.println("\nTambah Antrian");

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    dllPembeli.tambahAntrian( nama, hp);

                    break;

                case 2:

                    dllPembeli.cetakAntrian();
                    break;

                case 3:

                    Pembeli10 pembeli = dllPembeli.hapusAntrian();

                    if (pembeli != null) {

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();

                        dllPesanan.tambahPesanan(
                                kode,
                                namaPesanan,
                                harga
                        );

                        System.out.println(pembeli.namaPembeli + " telah memesan " + namaPesanan);
                    }

                    break;

                case 4:

                    dllPesanan.tampilPesanan();

                    break;

                case 5:

                    System.out.println("Program selesai");
                    break;

                default:

                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 5);

        sc.close();
    }
}