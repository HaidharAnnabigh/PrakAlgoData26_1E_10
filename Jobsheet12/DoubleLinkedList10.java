package Jobsheet12;

public class DoubleLinkedList10 {
    Node10 head;
    Node10 tail;
    int size;

    public DoubleLinkedList10() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa10 data) {
        Node10 newNode = new Node10(null, data, head);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa10 data) {
        Node10 newNode = new Node10(tail, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa10 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node10 current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            Node10 newNode = new Node10(current, data, current.next);
            current.next.prev = newNode;
            current.next = newNode;

            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            System.out.println("Data dihapus:");
            head.data.tampil();

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }

            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            System.out.println("Data dihapus:");
            tail.data.tampil();

            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }

            size--;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa10 data) {
        Node10 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        } else {
            Node10 newNode = new Node10(current, data, current.next);

            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }

            current.next = newNode;
        }
    }

    public void removeAfter(String keyNim) {
        Node10 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node tidak ditemukan");
        } else {
            Node10 removed = current.next;

            current.next = removed.next;

            if (removed.next != null) {
                removed.next.prev = current;
            } else {
                tail = current;
            }

            size--;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node10 current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;

            size--;
        }
    }

    public void getFirst() {
        if (!isEmpty()) {
            head.data.tampil();
        }
    }

    public void getLast() {
        if (!isEmpty()) {
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        Node10 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.data.tampil();
    }

    public int size() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            Node10 current = head;

            while (current != null) {
                current.data.tampil();
                System.out.println("----------------");
                current = current.next;
            }
        }
    }
}