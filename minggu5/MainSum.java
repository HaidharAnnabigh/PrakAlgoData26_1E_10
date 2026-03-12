package minggu5;
import java.util.Scanner;
public class MainSum {

    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = haidhar.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i+1) + " : ");
            sm.keuntungan[i] = haidhar.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Brute Force : " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide Conquer : " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}