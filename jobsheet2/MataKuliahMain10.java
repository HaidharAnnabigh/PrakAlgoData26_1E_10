public class MataKuliahMain10 {

    public static void main(String[] args) {
        System.out.println("\n=========== Mata Kuliah 1 ===========");
        MataKuliah10 matkul1 = new MataKuliah10();
        matkul1.nama = "Algoritma dan Struktur Data";
        matkul1.kodeMK = "69";
        matkul1.sks = 2;
        matkul1.jmlJam = 4;

        matkul1.tampilkanInfor();
        matkul1.updateSKS(4);
        matkul1.tambahJam(4);
        matkul1.tampilkanInfor();

        System.out.println("\n=========== Mata Kuliah 2 ==========");
        MataKuliah10 matkul2 = new MataKuliah10("Basis Data", "67", 2, 4);
        matkul2.tampilkanInfor();
        matkul2.updateSKS(3);
        matkul2.kurangJam(1);
        matkul2.tampilkanInfor();
    }
}