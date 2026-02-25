public class DosenMain10 {
    
    public static void main(String[] args) {
        System.out.println("========== Dosen 1 ==========");
        Dosen10 dos1 = new Dosen10();
        dos1.idDosen = "67698795";
        dos1.nama = "Sujianto";
        dos1.thnGabung = 2007;
        dos1.status = true;
        dos1.bidangAhli = "Bahasa Inggris";

        dos1.tampilkanInfo();
        System.out.println("\n----Update Informasi----");
        dos1.ubahKeahlian("Basis Data");
        dos1.tampilkanInfo();
        System.out.println("Masa Kerja :" + dos1.hitungMasKer(2026) + " tahun");

        System.out.println("\n========== Dosen 2 ==========");
        Dosen10 dos2 = new Dosen10("65674309", "Wagito", 2001, true, "Agama");
        dos2.status = false;
        dos2.tampilkanInfo();
        System.out.println("Masa Kerja : " + dos2.hitungMasKer(2026) + " tahun");
    }
    
}
