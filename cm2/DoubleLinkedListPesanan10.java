package cm2;

public class DoubleLinkedListPesanan10 {
    Pesanan10 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(int kode, String nama, int harga) {
        Pesanan10 baru = new Pesanan10(kode, nama, harga);

        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

        System.out.println("Pesanan berhasil ditambahkan");
    }

    public void sortingPesanan() {
        if (head == null) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;
            Pesanan10 current = head;

            while (current.next != null) {

                if (current.namaPesanan.compareToIgnoreCase(current.next.namaPesanan) > 0) {

                    int tempKode = current.kodePesanan;
                    String tempNama = current.namaPesanan;
                    int tempHarga = current.harga;

                    current.kodePesanan = current.next.kodePesanan;
                    current.namaPesanan = current.next.namaPesanan;
                    current.harga = current.next.harga;

                    current.next.kodePesanan = tempKode;
                    current.next.namaPesanan = tempNama;
                    current.next.harga = tempHarga;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    public void tampilPesanan() {

        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sortingPesanan();

        System.out.println("========================================");
        System.out.println("Laporan Pesanan (URUT NAMA PESANAN)");
        System.out.println("========================================");
        System.out.println("Kode Pesanann\tNama Pesanan\t\tHarga");
        Pesanan10 temp = head;
        int total = 0;

        while (temp != null) {

           System.out.println(temp.kodePesanan + "\t\t" + temp.namaPesanan + "\t\t" + temp.harga);
            total += temp.harga;
            temp = temp.next;
        }

        System.out.println("Total Pendapatan : Rp " + total);
    }
}