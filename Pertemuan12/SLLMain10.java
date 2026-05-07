package Pertemuan12;

public class SLLMain10 {

    public static void main(String[] args) {
        SingleLinkedList10 sll = new SingleLinkedList10();

        Mahasiswa10 mhs1 = new Mahasiswa10("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa10 mhs2 = new Mahasiswa10("23212201", "Bimon", "2B", 3.8);
        Mahasiswa10 mhs3 = new Mahasiswa10("22212202", "Cintia", "3C", 3.5);
        Mahasiswa10 mhs4 = new Mahasiswa10("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data pada index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}