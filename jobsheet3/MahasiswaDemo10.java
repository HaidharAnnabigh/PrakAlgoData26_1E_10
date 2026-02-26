package jobsheet3;

public class MahasiswaDemo10 {

    public static void main(String[] args) {
        Mahasiswa10[] arrayMhs = new Mahasiswa10[3];

        arrayMhs[0] = new Mahasiswa10();
        arrayMhs[0].nim = "244107060033";
        arrayMhs[0].nama = "AGNES TITANIA KINANTI";
        arrayMhs[0].kelas = "SIB-1E";
        arrayMhs[0].ipk = (float) 3.75;

        arrayMhs[1] = new Mahasiswa10();
        arrayMhs[1].nim = "2341720172";
        arrayMhs[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayMhs[1].kelas = "TI-2A";
        arrayMhs[1].ipk = (float) 3.36;

        arrayMhs[2] = new Mahasiswa10();
        arrayMhs[2].nim = "244107023006";
        arrayMhs[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayMhs[2].kelas = "TI-2E";
        arrayMhs[2].ipk = (float) 3.80;
    
        System.out.println("NIM   : "+ arrayMhs[0].nim);
        System.out.println("Nama  : "+ arrayMhs[0].nama);
        System.out.println("Kelas : "+ arrayMhs[0].kelas);
        System.out.println("IPK   : "+ arrayMhs[0].ipk);
        System.out.println("----------------------------------");
        System.out.println("NIM   : "+ arrayMhs[1].nim);
        System.out.println("Nama  : "+ arrayMhs[1].nama);
        System.out.println("Kelas : "+ arrayMhs[1].kelas);
        System.out.println("IPK   : "+ arrayMhs[1].ipk);
        System.out.println("----------------------------------");
        System.out.println("NIM   : "+ arrayMhs[2].nim);
        System.out.println("Nama  : "+ arrayMhs[2].nama);
        System.out.println("Kelas : "+ arrayMhs[2].kelas);
        System.out.println("IPK   : "+ arrayMhs[2].ipk);
        System.out.println("----------------------------------");
        
    }
}