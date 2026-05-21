package cm2;

public class Pesanan10 {
    int kodePesanan, harga;
    String namaPesanan;
    Pesanan10 prev, next;

    public Pesanan10(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }
}
