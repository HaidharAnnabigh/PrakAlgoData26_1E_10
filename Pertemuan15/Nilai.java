package Pertemuan15;

public class Nilai {
    Mhs mahasiswa;
    MataKuliah mataKuliah;
    double nilai;

    public Nilai() {
    }

    public Nilai(Mhs mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public Mhs getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

    public void setMahasiswa(Mhs mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-40s %-5d %.2f",
                mahasiswa.getNim(),
                mahasiswa.getNama(),
                mataKuliah.getNamaMK(),
                mataKuliah.getSks(),
                nilai);
    }
}