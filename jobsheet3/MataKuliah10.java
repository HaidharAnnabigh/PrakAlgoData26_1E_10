package jobsheet3;

public class MataKuliah10 {
    public String kode;
    public String nama;
    public int sks;
    public int jmlJam;
    public String ruang;

    public MataKuliah10(String kode, String nama, int sks, int jmlJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }

    void tambahData (String ruang) {
        this.ruang = ruang;
    }
}
