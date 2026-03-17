package minggu5;

public class DaftarNilai {

   
    int nilaiUAS, nilaiUTS;

    public DaftarNilai(int nilaiUTS, int nilaiUAS) {
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    static int maxDC(DaftarNilai[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int maxL = maxDC(arr, l, mid);
        int maxR = maxDC(arr, mid + 1, r);

        return Math.max(maxL, maxR);
    }

    static int minDC(DaftarNilai[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUAS;
        }

        int mid = (l + r) / 2;
        int minL = minDC(arr, l, mid);
        int minR = minDC(arr, mid + 1, r);

        return Math.min(minL, minR);
    }

    static double rataUASBF(DaftarNilai[] arr) {
        int total = 0;
        for (DaftarNilai nilai : arr) {
            total += nilai.nilaiUAS;
        }
        return (double) total / arr.length;
    }
}