package jobsheet3;
import java.util.Scanner;

public class MahasiswaDemo10 {

    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);
        Mahasiswa10[] arrayMhs = new Mahasiswa10[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayMhs[i] = new Mahasiswa10();

            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            System.out.print("NIM : ");
            arrayMhs[i].nim = haidhar.nextLine();
            System.out.print("Nama : ");
            arrayMhs[i].nama = haidhar.nextLine();
            System.out.print("Kelas : ");
            arrayMhs[i].kelas = haidhar.nextLine();
            System.out.print("IPK : ");
            dummy = haidhar.nextLine();
            arrayMhs[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------------------");
            
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayMhs[i].cetakInfo();
        }
        
    }
}