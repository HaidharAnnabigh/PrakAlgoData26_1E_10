package cm1;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    
    // kontruktor
    Peminjaman (Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    //menghitung banyak denda jika terlambat mengembalikan
    void hitungDenda () {
        if (lamaPinjam > 5) {
            terlambat = lamaPinjam - 5;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    // untuk menampilkan data peminjaman saat di call
    void tampilPeminjaman () {
        System.out.println("Nama: " + mhs.nama + " | " +  "Judul: " + buku.judul + " | " + "Lama: " + lamaPinjam + " | " +  "Terlambat: " + terlambat + " | " + "Denda: " + denda);
    }
}
