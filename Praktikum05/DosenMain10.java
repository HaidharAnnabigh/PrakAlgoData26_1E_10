package Praktikum05;
import java.util.Scanner;

public class DosenMain10 {
    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);
        DataDosen10 daDos = new DataDosen10();
        int pilihan;

        do {
            System.out.println("\nMENU DATA DOSEN");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort - Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Selection Sort - Tertua ke Termuda)");
            System.out.println("5. Insertion Sort ASC (Termuda ke Tertua)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = haidhar.nextInt();
            haidhar.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Dosen      : ");
                    String kode = haidhar.nextLine();
                    System.out.print("Nama Dosen      : ");
                    String nama = haidhar.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = haidhar.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia            : ");
                    int usia = haidhar.nextInt();
                    haidhar.nextLine();
                    daDos.tambah(new Dosen10(kode, nama, jk, usia));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\nDATA SELURUH DOSEN");
                    daDos.tampil();
                    break;

                case 3:
                    daDos.sortingASC();
                    System.out.println("\nDATA DOSEN (BUBBLE SORT ASC - Termuda)");
                    daDos.tampil();
                    break;

                case 4:
                    daDos.sortingDSC();
                    System.out.println("\nDATA DOSEN (SELECTION SORT DSC - Tertua)");
                    daDos.tampil();
                    break;

                case 5:
                    daDos.insertionSort();
                    System.out.println("\nDATA DOSEN (INSERTION SORT ASC - Termuda)");
                    daDos.tampil();
                    break;

                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
