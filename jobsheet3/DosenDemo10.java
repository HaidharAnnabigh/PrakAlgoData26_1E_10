package jobsheet3;
import java.util.Scanner;
public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah Dosen: ");
        int jmlDos = haidhar.nextInt();
        haidhar.nextLine();
        System.out.println("----------------------------------------------");
        Dosen10[] arrayDos = new Dosen10[jmlDos];
        String kode, nama, jenKel;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayDos.length; i++) {
            System.out.println("Masukkan data Dosen ke-" + (i+1));
            System.out.print("Kode    : ");
            kode = haidhar.nextLine();
            System.out.print("Nama    : ");
            nama = haidhar.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            jenKel = haidhar.nextLine();
            if (jenKel.equalsIgnoreCase("L")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }

            System.out.print("Usia    : ");
            usia = haidhar.nextInt();
            haidhar.nextLine();
            System.out.println("----------------------------------------------");

            arrayDos[i] = new Dosen10(kode, nama, jenisKelamin, usia);
            
        }

        DataDosen10 dataDosen = new DataDosen10();
        System.out.println("---------------------- Informasi Dosen ----------------------");
        dataDosen.dataSemuaDosen(arrayDos);
        System.out.println("-------------- Jumlah Dosen per Jenis Kelamin ---------------");
        dataDosen.jmlDosenPerJenkel(arrayDos);
        System.out.println("---------- Rata-rata Usia Dosen per Jenis Kelamin -----------");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayDos);
        System.out.println("=---------------- Informasi Dosen Paling Tua ----------------");
        dataDosen.infoDosenPalingTua(arrayDos);
        System.out.println("---------------- Informasi Dosen Paling Muda ----------------");
        dataDosen.infoDosenPalingMuda(arrayDos);
    
        

    }
    
}