package jobsheet1;

public class fungsi {

    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static String[] toko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static int[] harga =  { 75000, 50000, 60000, 10000 };

    public static int pendapatan (int inToko) {
        int totalPend = 0;
        for (int i = 0; i < harga.length; i++) {
            totalPend += stockBunga[inToko][i] * harga[i];
        }
        return totalPend;
    }

    public static void tampil (int pend) {
        if (pend > 1500000) {
            System.out.println("Status cabang = Sangat Baik.");
        } else {
            System.out.println("Status cabang = Perlu Evaluasi.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("        PENDAPATAN ROYALGARDEN TIAP CABANG");
        System.out.println("=====================================================");
        for (int i = 0; i < toko.length; i++) {
            int pend = pendapatan(i);
            System.out.println("\nCabang -- " + toko[i] + " --");
            System.out.println("Pendapatan = Rp. " + pend);
            tampil(pend);
        }
    }
}
