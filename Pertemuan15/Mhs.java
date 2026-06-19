package Pertemuan15;

public class Mhs {
    String nim;
    String nama;
    String notelp;

    public Mhs() {
    }

    public Mhs(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mhs{nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + "}";
    }
}