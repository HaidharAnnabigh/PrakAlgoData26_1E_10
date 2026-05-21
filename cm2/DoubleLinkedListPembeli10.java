package cm2;

public class DoubleLinkedListPembeli10 {
    Pembeli10 head, tail;
    int countAntrian, jml;

    boolean isEmpty() {
        return head == null;
    }

    void tambahAntrian(String namaPembeli, String noHp) {
        countAntrian++;
        Pembeli10 baru = new Pembeli10(countAntrian, namaPembeli, noHp);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
        jml++;
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + countAntrian);
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("========================================");
        System.out.println("No Antrian\tNama\t\tNo HP");
        Pembeli10 temp = head;

        while (temp != null) {
            System.out.println(temp.noAntrian + "\t\t" + temp.namaPembeli + "\t\t" + temp.noHp);
            temp = temp.next;
        }
    }

    public Pembeli10 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        Pembeli10 hapus = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return hapus;
    }

    public int jumlahAntrian() {
        int jumlah = 0;
        Pembeli10 temp = head;

        while (temp != null) {
            jumlah++;
            temp = temp.next;
        }

        return jumlah;
    }
}