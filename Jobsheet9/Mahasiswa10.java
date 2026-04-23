package Jobsheet9;

public class Mahasiswa10 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa10(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}