package jobsheet1;
import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);

        System.out.println("Program menghitung Nilai Akhir");
        System.out.println("====================================");
        System.out.print("Masukkan nilai Tugas: ");
        double tugas = haidhar.nextDouble();
        System.out.print("Masukkan nilai Kuis: ");
        double kuis = haidhar.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = haidhar.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = haidhar.nextDouble();

        System.out.println("====================================");
        System.out.println("====================================");

        if (tugas>100 || tugas<0 || kuis>100 || kuis<0 || uts>100 || uts<0 || uas>100 || uas<0) {
          System.out.println("Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
        }    else {
            double akhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
            String huruf;

            if (akhir <= 100 && akhir >80 ) {
            huruf = "A";
            } else if (akhir <= 80 && akhir >73) {
                huruf = "B+";
            } else if (akhir <= 73 && akhir >65) {
                huruf = "B";
            } else if (akhir <= 65 && akhir >60) {
                huruf = "C+";
            } else if (akhir <= 60 && akhir >50) {
                huruf = "C";
            } else if (akhir <= 50 && akhir >39) {
                huruf = "D";
            } else {
                huruf = "E";
            } 

            String status;
            if (huruf == "D" || huruf == "E") {
                status = "TIDAK LULUS";
            } else {
                status = "LULUS";
            }

            System.out.println("Nilai Akhir : " + akhir);
            System.out.println("Nilai Huruf : " + huruf);

            System.out.println("====================================");
            System.out.println(status);
        }

    }
}
