package minggu5;

public class DaftarNilaiMain {

     public static void main(String[] args) {
        DaftarNilai[] mhs = new DaftarNilai[8];

        mhs[0] = new DaftarNilai(78, 82);
        mhs[1] = new DaftarNilai(85, 88);
        mhs[2] = new DaftarNilai(90, 87);
        mhs[3] = new DaftarNilai(76, 79);
        mhs[4] = new DaftarNilai(92, 95);
        mhs[5] = new DaftarNilai(88, 85);
        mhs[6] = new DaftarNilai(80, 83);
        mhs[7] = new DaftarNilai(82, 84);

        System.out.println("=============== HASIL PERHITUNGAN ===============");

        int tertinggiUTS = DaftarNilai.maxDC(mhs, 0, mhs.length - 1);
        System.out.println("a) Nilai UTS tertinggi (Divide Conquer) : " + tertinggiUTS);

        int terendahUTS = DaftarNilai.minDC(mhs, 0, mhs.length - 1);
        System.out.println("b) Nilai UTS terendah (Divide Conquer)  : " + terendahUTS);

        double rataUAS = DaftarNilai.rataUASBF(mhs);
        System.out.println("c) Rata-rata nilai UAS (Brute Force)    : " + rataUAS);
    }
}