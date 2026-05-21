package cm2;

public class Pembeli10 {
    int noAntrian;
    String namaPembeli, noHp;
    Pembeli10 prev, next;

    public Pembeli10(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }
}