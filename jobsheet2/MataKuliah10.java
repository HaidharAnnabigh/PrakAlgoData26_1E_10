public class MataKuliah10 {

    String kodeMK, nama;
    int jmlJam, sks;

    public MataKuliah10() {

    }

    public MataKuliah10(String nmMK, String kodeMK, int sks, int jmlJam) {
        nama = nmMK;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }

    void tampilkanInfor() {
        System.out.println("Nama Mata Kuliah  : " + nama);
        System.out.println("Kode Mata Kuliah  : " + kodeMK);
        System.out.println("Jumlah SKS        :" + sks);
        System.out.println("Jumlah Jam        :" + jmlJam);
    }

    void updateSKS (int sksNew) {
        sks = sksNew;
        System.out.println("SKS telah diubah menjadi " + sksNew);
    }

    void tambahJam (int jam) {
        jmlJam += jam;
        System.out.println("Jumlah jam telah ditambah sebanyak " + jam + " jam");
    }

    void kurangJam (int jam) {
        if (jmlJam >= jam) {
            jmlJam -= jam;
            System.out.println("Jumlah jam telah dikurangi sebanyak " + jam + " jam");
        } else {
            System.out.println("Pengurangan jumlah jam tidak dapat dilakukan!");
        }
    }
}