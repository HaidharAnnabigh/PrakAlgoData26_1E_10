package jobsheet3;

public class DataDosen10 {

    void dataSemuaDosen (Dosen10[] arrayDos) {
        for (int i = 0; i < arrayDos.length; i++) {
            arrayDos[i].tampil();
        }
    }

    void jmlDosenPerJenkel (Dosen10[] arrayDos) {
        int jmlL = 0;
        int jmlP = 0;

        for (int i = 0; i < arrayDos.length; i++) {
            if (arrayDos[i].jenisKelamin) {
                jmlL++;
            } else {
                jmlP++;
            }
        }

        System.out.println("Jumlah Dosen Laki-laki : " + jmlL);
        System.out.println("Jumlah Dosen Perempuan : " + jmlP);
    }

    void rerataUsiaDosenPerJenisKelamin (Dosen10[] arrayDos) {
        int totUsiaL = 0;
        int totUsiaP = 0;
        int jmlL = 0;
        int jmlP = 0;

        for (int i = 0; i < arrayDos.length; i++) {
            if (arrayDos[i].jenisKelamin) {
                totUsiaL += arrayDos[i].usia;
                jmlL++;
            } else {
                totUsiaP += arrayDos[i].usia;
                jmlP++;
            }
        }
        
        double rataUsiaL = (jmlL > 0) ? (double) totUsiaL / jmlL : 0;
        double rataUsiaP = (jmlP > 0) ? (double) totUsiaP / jmlP : 0;

        System.out.println("Rata-rata usia Dosen Laki-laki : " + rataUsiaL);
        System.out.println("Rata-rata usia Dosen Perempuan : " + rataUsiaP);
    }

    void infoDosenPalingTua(Dosen10[] arrayDos) {
        Dosen10 dosenTua = arrayDos[0];

        for (int i = 1; i < arrayDos.length; i++) {
            if (arrayDos[i].usia > dosenTua.usia) {
                dosenTua = arrayDos[i];
            }
        }

        dosenTua.tampil();
    }

    public void infoDosenPalingMuda(Dosen10[] arrayDos) {
        Dosen10 dosenMuda = arrayDos[0];

        for (int i = 1; i < arrayDos.length; i++) {
            if (arrayDos[i].usia < dosenMuda.usia) {
                dosenMuda = arrayDos[i];
            }
        }

        dosenMuda.tampil();
    }
}