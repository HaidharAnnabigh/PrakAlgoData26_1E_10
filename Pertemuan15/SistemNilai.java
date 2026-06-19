package Pertemuan15;
import java.util.*;

public class SistemNilai {

    static List<Mhs> daftarMahasiswa = new ArrayList<>();
    static List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    static List<Nilai> daftarNilai = new ArrayList<>();

    static Queue<String> antrianHapus = new LinkedList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initDataAwal();
        boolean running = true;
        while (running) {
            tampilMenu();
            System.out.print("Pilih    : ");
            String pilihan = sc.nextLine().trim();
            System.out.println();
            switch (pilihan) {
                case "1" -> inputNilai();
                case "2" -> tampilNilai();
                case "3" -> cariNilaiMahasiswa();
                case "4" -> urutDataNilai();
                case "5" -> hapusMahasiswaViaQueue();
                case "6" -> {
                    System.out.println("Terima kasih. Program selesai.");
                    running = false;
                }
                default -> System.out.println("Pilihan tidak valid!\n");
            }
        }
    }

    static void initDataAwal() {
        daftarMahasiswa.add(new Mhs("20001", "Thalhah", "021xxx"));
        daftarMahasiswa.add(new Mhs("20002", "Zubair", "021xxx"));
        daftarMahasiswa.add(new Mhs("20003", "Abdur-Rahman", "021xxx"));
        daftarMahasiswa.add(new Mhs("20004", "Sa'ad", "021xxx"));
        daftarMahasiswa.add(new Mhs("20005", "Sa'id", "021xxx"));
        daftarMahasiswa.add(new Mhs("20006", "Ubaidah", "021xxx"));

        daftarMataKuliah.add(new MataKuliah("00001", "Internet of Things", 3));
        daftarMataKuliah.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        daftarMataKuliah.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
        daftarMataKuliah.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    static void tampilMenu() {
        System.out.println("**********************************************");
        System.out.println("  SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("**********************************************");
        System.out.println("  1. Input Nilai");
        System.out.println("  2. Tampil Nilai");
        System.out.println("  3. Mencari Nilai Mahasiswa");
        System.out.println("  4. Urut Data Nilai");
        System.out.println("  5. Hapus Mahasiswa (Queue)");
        System.out.println("  6. Keluar");
        System.out.println("**********************************************");
    }

    static void inputNilai() {
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("**********************************************");
        System.out.printf("%-8s %-20s %s%n", "NIM", "Nama", "Telf");
        for (Mhs mhs : daftarMahasiswa) {
            System.out.printf("%-8s %-20s %s%n",
                    mhs.getNim(), mhs.getNama(), mhs.getNotelp());
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nimInput = sc.nextLine().trim();

        Mhs mhsDipilih = cariMahasiswaByNim(nimInput);
        if (mhsDipilih == null) {
            System.out.println("Mahasiswa tidak ditemukan!\n");
            return;
        }

        System.out.println();
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("**********************************************");
        System.out.printf("%-8s %-45s %s%n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.printf("%-8s %-45s %d%n",
                    mk.getKode(), mk.getNamaMK(), mk.getSks());
        }
        System.out.print("Pilih MK by kode: ");
        String kodeInput = sc.nextLine().trim();

        MataKuliah mkDipilih = cariMataKuliahByKode(kodeInput);
        if (mkDipilih == null) {
            System.out.println("Mata Kuliah tidak ditemukan!\n");
            return;
        }

        System.out.print("Masukan data\nNilai   : ");
        double nilaiInput;
        try {
            nilaiInput = Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Format nilai tidak valid!\n");
            return;
        }

        daftarNilai.add(new Nilai(mhsDipilih, mkDipilih, nilaiInput));
        System.out.println("Data nilai berhasil ditambahkan!\n");
    }

    static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("**********************************************");
        if (daftarNilai.isEmpty()) {
            System.out.println("Belum ada data nilai.\n");
            return;
        }
        cetakHeaderNilai();
        daftarNilai.forEach(n -> System.out.println(n));
        System.out.println();
    }

    static void cariNilaiMahasiswa() {
        tampilNilai();
        System.out.print("Masukkan data mahasiswa[nim] :");
        String nimCari = sc.nextLine().trim();

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("**********************************************");
        cetakHeaderNilai();

        int totalSks = 0;
        boolean found = false;
        for (Nilai n : daftarNilai) {
            if (n.getMahasiswa().getNim().equals(nimCari)) {
                System.out.println(n);
                totalSks += n.getMataKuliah().getSks();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        } else {
            System.out.println("Total SKS " + totalSks + " telah diambil.");
        }
        System.out.println();
    }

    static void urutDataNilai() {
        if (daftarNilai.isEmpty()) {
            System.out.println("Belum ada data nilai.\n");
            return;
        }

        System.out.println("Urut berdasarkan:");
        System.out.println("  1. Nilai Ascending");
        System.out.println("  2. Nilai Descending");
        System.out.println("  3. NIM Ascending");
        System.out.print("Pilih : ");
        String pil = sc.nextLine().trim();

        List<Nilai> sorted = new ArrayList<>(daftarNilai);
        switch (pil) {
            case "1" -> sorted.sort(Comparator.comparingDouble(Nilai::getNilai));
            case "2" -> sorted.sort(Comparator.comparingDouble(Nilai::getNilai).reversed());
            case "3" -> sorted.sort(Comparator.comparing(n -> n.getMahasiswa().getNim()));
            default -> {
                System.out.println("Pilihan tidak valid.\n");
                return;
            }
        }

        System.out.println();
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("**********************************************");
        cetakHeaderNilai();
        sorted.forEach(n -> System.out.println(n));
        System.out.println();
    }

    static void hapusMahasiswaViaQueue() {
        System.out.println("=== HAPUS MAHASISWA VIA QUEUE ===");
        System.out.println(
                "Masukkan NIM mahasiswa yang ingin dihapus (ketik 'proses' untuk eksekusi, 'batal' untuk kembali):");

        while (true) {
            System.out.print("NIM (atau 'proses'/'batal'): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("batal")) {
                antrianHapus.clear();
                System.out.println("Operasi dibatalkan.\n");
                return;
            }
            if (input.equalsIgnoreCase("proses"))
                break;

            if (cariMahasiswaByNim(input) == null) {
                System.out.println("  NIM " + input + " tidak ditemukan, tidak dimasukkan antrian.");
            } else {
                antrianHapus.offer(input);
                System.out.println("  NIM " + input + " masuk antrian hapus.");
            }
        }

        if (antrianHapus.isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dihapus.\n");
            return;
        }

        System.out.println("\nMemproses antrian hapus...");
        while (!antrianHapus.isEmpty()) {
            String nim = antrianHapus.poll();
            Mhs mhs = cariMahasiswaByNim(nim);
            if (mhs != null) {
                daftarNilai.removeIf(n -> n.getMahasiswa().getNim().equals(nim));
                daftarMahasiswa.remove(mhs);
                System.out.println("  Mhs NIM " + nim + " (" + mhs.getNama() + ") berhasil dihapus.");
            }
        }
        System.out.println("Selesai.\n");
    }

    static Mhs cariMahasiswaByNim(String nim) {
        return daftarMahasiswa.stream()
                .filter(m -> m.getNim().equals(nim))
                .findFirst()
                .orElse(null);
    }

    static MataKuliah cariMataKuliahByKode(String kode) {
        return daftarMataKuliah.stream()
                .filter(mk -> mk.getKode().equals(kode))
                .findFirst()
                .orElse(null);
    }

    static void cetakHeaderNilai() {
        System.out.printf("%-10s %-15s %-40s %-5s %s%n",
                "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
    }
}