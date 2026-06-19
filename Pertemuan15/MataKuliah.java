package Pertemuan15;

public class MataKuliah {
    String kode;
    String namaMK;
    int sks;

    public MataKuliah() {
    }

    public MataKuliah(String kode, String namaMK, int sks) {
        this.kode = kode;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{kode=" + kode + ", namaMK=" + namaMK + ", sks=" + sks + "}";
    }
}