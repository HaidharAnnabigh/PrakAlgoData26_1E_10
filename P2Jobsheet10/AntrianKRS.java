package P2Jobsheet10;

public class AntrianKRS {
    Mahasiswa10[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahProses;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa10[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahProses = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    public void tambah(Mahasiswa10 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
            return;
        }
        for (int i = 0; i < 2; i++) {
            Mahasiswa10 mhs = data[front];
            System.out.println("Diproses:");
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahProses++;
        }
    }

    public void tampilSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampil2Terdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
            return;
        }
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahProses() {
        return sudahProses;
    }

    public int getBelumProses() {
        return (30 - sudahProses);
    }
}   