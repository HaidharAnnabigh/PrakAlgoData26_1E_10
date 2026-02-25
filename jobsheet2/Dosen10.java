public class Dosen10 {

    String idDosen, nama, bidangAhli;
    boolean status;
    int thnGabung;
    
    public Dosen10() {

    }

    public Dosen10(String id, String nm, int thnGbng, boolean sts, String bdgAh) {
        idDosen = id;
        nama = nm;
        thnGabung = thnGbng;
        status = sts;
        bidangAhli = bdgAh;
    }

    void tampilkanInfo() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Tahun Bergabung : " + thnGabung);
        System.out.println("Status Aktif : " + status);
        System.out.println("Bidang Keahlian : " + bidangAhli);
    }

    void statusAktif (boolean sttus) {
        status=sttus;
    }

    int hitungMasKer (int thnSkrng) {
        return thnSkrng-thnGabung;
    }

    void ubahKeahlian (String bdg) {
        bidangAhli = bdg;
    }
}