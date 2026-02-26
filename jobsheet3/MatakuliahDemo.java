package jobsheet3;
import java.util.Scanner;
public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jmlMatkul = haidhar.nextInt();
        haidhar.nextLine();
        MataKuliah10[] arrayMatkul = new MataKuliah10[jmlMatkul];
        String kode, nama, dummy, ruang;
        int sks, jmlJam;

        for(int i=0; i < arrayMatkul.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode      : ");
            kode = haidhar.nextLine();
            System.out.print("Nama      : ");
            nama = haidhar.nextLine();
            System.out.print("SKS       : ");
            dummy = haidhar.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = haidhar.nextLine();
            jmlJam = Integer.parseInt(dummy);
            System.out.print("Ruang      : ");
            ruang = haidhar.nextLine();
            System.out.println("----------------------------------------------");

            arrayMatkul[i] = new MataKuliah10(kode, nama, sks, jmlJam);
            arrayMatkul[i].tambahData(ruang);
            
        }

        for (int i = 0; i < arrayMatkul.length; i++) {
            System.out.println("Masukkan data Mata Kuliah ke-" + (i+1));
            arrayMatkul[i].cetakInfo();
            System.out.println("----------------------------------------------");
            
        }
    }
}