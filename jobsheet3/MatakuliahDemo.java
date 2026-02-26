package jobsheet3;
import java.util.Scanner;
public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner haidhar = new Scanner(System.in);
        MataKuliah10[] arrayMatkul = new MataKuliah10[3];
        String kode, nama, dummy, ruang;
        int sks, jmlJam;

        for(int i=0; i < 3; i++) {
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

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data Mata Kuliah ke-" + (i+1));
            System.out.println("Kode Mata Kuliah: " + arrayMatkul[i].kode);
            System.out.println("Nama Mata Kuliah: " + arrayMatkul[i].nama);
            System.out.println("Jumlah SKS      : " + arrayMatkul[i].sks);
            System.out.println("Jumlah Jam      : " + arrayMatkul[i].jmlJam);
            System.out.println("Jumlah Jam      : " + arrayMatkul[i].ruang);
            System.out.println("----------------------------------------------");
            
        }
    }
}