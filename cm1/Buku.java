package cm1;

public class Buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    //konstruktor
    Buku (String kode, String judul, int tahun) {
        kodeBuku = kode;
        this.judul = judul;
        tahunTerbit = tahun;
    }
    
    // untuk menampilkan data buku saat di call
    void tampilBuku () {
        System.out.println("Kode: " + kodeBuku + " | " + "Judul: " + judul + " | " + "Tahun: " + tahunTerbit);
    }
}