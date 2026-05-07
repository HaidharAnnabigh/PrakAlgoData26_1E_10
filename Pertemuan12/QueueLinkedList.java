package Pertemuan12;
 
public class QueueLinkedList {
    Node front;
    Node rear;
    int size;
    int max;
 
    public QueueLinkedList(int max) {
        this.max = max;
        size = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            Node newNode = new Node(data, null);

            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }

            size++;
            System.out.println(data.nama + " berhasil masuk antrian");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa dipanggil:");
            front.data.tampilData();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampilData();
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            Node temp = front;

            System.out.println("Daftar Antrian:");
            while (temp != null) {
                temp.data.tampilData();
                System.out.println("-------------------");
                temp = temp.next;
            }
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}