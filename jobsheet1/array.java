package jobsheet1;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);

        System.out.println("==============================================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================================================");

        int jmlMatkul = 8;
        String[] namaMatkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        double[] angka = new double[jmlMatkul];
        String[] huruf = new String[jmlMatkul];
        double[] setara = new double[jmlMatkul];
        double sumBobot = 0;
        int sumSks = 0;
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("Masukkan nilai angka untuk Mata Kuliah " + (namaMatkul[i]) + ": ");
            angka[i] = haidhar.nextDouble();
            haidhar.nextLine();

             if (angka[i] <= 100 && angka[i] >80 ) {
                huruf[i] = "A";
                setara[i] = 4.0;
            } else if (angka[i] <= 80 && angka[i] >73) {
                huruf[i] = "B+";
                setara[i] = 3.5;
            } else if (angka[i] <= 73 && angka[i] >65) {
                huruf[i] = "B";
                setara[i] = 3.0;
            } else if (angka[i] <= 65 && angka[i] >60) {
                huruf[i] = "C+";
                setara[i] = 2.5;
            } else if (angka[i] <= 60 && angka[i] >50) {
                huruf[i] = "C";
                setara[i] = 2.0;
            } else if (angka[i] <= 50 && angka[i] >39) {
                huruf[i] = "D";
                setara[i] = 1;
            } else {
                huruf[i] = "E";
                setara[i] = 0;
            } 
            sumBobot += setara[i] * sks[i];
            sumSks += sks[i];
        }
        double ip = sumBobot / sumSks;
        System.out.println("\n==============================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================================================");

        System.out.println("==============================================================");
        System.out.printf("%-37s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("==============================================================");
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.printf("%-37s %-12.2f %-12s %-12.2f\n", namaMatkul[i], angka[i], huruf[i], setara[i]);
        }
        System.out.println("==============================================================");
        System.out.printf("IP Semester : %.2f\n", ip);
        System.out.println("==============================================================");
    
    }
}