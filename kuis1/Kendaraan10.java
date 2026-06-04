package kuis1;

public class Kendaraan10 {

    String nomorPlat;
    double jarakTempuh, konsumsiBahanBakar;

    public Kendaraan10(String nomorPlat, double jarakTempuh, double konsumsiBahanBakar) {
        this.nomorPlat = nomorPlat;
        this.jarakTempuh = jarakTempuh;
        this.konsumsiBahanBakar = konsumsiBahanBakar;
    }

    //method untuk menghitung nilai efisiensi
    double efisiensiBBM (double jarakTempuh, double konsumsiBahanBakar) {
        double nilaiEfisiensi = jarakTempuh / konsumsiBahanBakar;

        return nilaiEfisiensi;
    }
    
    // method untuk menampilkan semua data
    void printData () {
        System.out.println("Nomor Plat : " + nomorPlat);
        System.out.println("Jarak Tempuh : " + jarakTempuh);
        System.out.println("Konsumsi Bahan Bakar : " + konsumsiBahanBakar);
    }
}