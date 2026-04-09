package cm1;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    //konstruktor
    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    // untuk menampilkan data mahasiswa saat di call
    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | " + "Nama: " + nama + " | " + "Prodi: " + prodi);
    }
}