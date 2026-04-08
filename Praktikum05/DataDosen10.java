package Praktikum05;

public class DataDosen10 {
    Dosen10[] dataDos = new Dosen10[10];
    int idx;

    void tambah(Dosen10 dos) {
        if (idx < dataDos.length) {
            dataDos[idx] = dos;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDos[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDos[j - 1].usia > dataDos[j].usia) {
                    Dosen10 tmp       = dataDos[j];
                    dataDos[j]    = dataDos[j - 1];
                    dataDos[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDos[j].usia > dataDos[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen10 tmp        = dataDos[idxMax];
            dataDos[idxMax] = dataDos[i];
            dataDos[i]     = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen10 temp = dataDos[i];
            int j = i;
            while (j > 0 && dataDos[j - 1].usia > temp.usia) {
                dataDos[j] = dataDos[j - 1];
                j--;
            }
            dataDos[j] = temp;
        }
    }
}
