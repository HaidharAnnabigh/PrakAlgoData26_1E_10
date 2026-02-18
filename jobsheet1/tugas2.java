package jobsheet1;

import java.util.Scanner;

public class tugas2 {
    public static Scanner haidhar = new Scanner(System.in);

    public static void jadwalMatkul (String[][] jadwal, int jmlMatkul) {
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("Jadwal Mata Kuliah ke-" + (i + 1));
            System.out.print("Mata Kuliah : ");
            jadwal[i][0] = haidhar.nextLine();
            System.out.print("Ruang       : ");
            jadwal[i][1] = haidhar.nextLine();
            System.out.print("Hari        : ");
            jadwal[i][2] = haidhar.nextLine();
            System.out.print("Pada jam    : ");
            jadwal[i][3] = haidhar.nextLine();
        }
    }

    public static void tampilSemua (String[][] jadwal, int jmlMatkul) {
        System.out.println("-----------------JADWAL KULIAH-----------------");
        System.out.println("===================================================================");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("===================================================================");
 
        for (int i = 0; i < jmlMatkul; i++) {
          System.out.printf("%-25s %-15s %-10s %-15s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static void tampilHari (String[][] jadwal, int jmlMatkul, String hari) {
        System.out.println("Jadwal hari " + hari + " : ");
        for (int i = 0; i < jmlMatkul; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("Mata kuliah : " +jadwal[i][0]);
                System.out.println("Ruang       : " +jadwal[i][1]);
                System.out.println("Pada jam    : " +jadwal[i][3] + "\n");
            }
        }
    }

    public static void tampilMatkul(String[][] jadwal, int jmlMatkul, String matkul) {

        System.out.println("\njadwal untuk Mata Kuliah " + matkul + ":");

        for (int i = 0; i < jmlMatkul; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal Mata Kuliah : ");
        int jmlMatkul = Integer.parseInt(haidhar.nextLine());
        System.out.println("------------------------------------------");

        String[][] jadwal = new String[jmlMatkul][4];
        jadwalMatkul(jadwal, jmlMatkul);
        tampilSemua(jadwal, jmlMatkul);

        System.out.print("\nBerdasarkan hari : ");
        String hari = haidhar.nextLine();
        tampilHari(jadwal, jmlMatkul, hari);

        System.out.print("\nBerdasarkan mata kuliah : ");
        String matkul = haidhar.nextLine();
        tampilMatkul(jadwal, jmlMatkul, matkul);
    }
}
