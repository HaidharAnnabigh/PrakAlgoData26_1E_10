package Praktikum05;

public class Dosen10 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen10(String kod, String nm, boolean jk, int age) {
        kode        = kod;
        nama        = nm;
        jenisKelamin = jk;
        usia        = age;
    }

    void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
        System.out.println("------------------------------");
    }
}