package Pertemuan14;
 
public class BinaryTreeArrayMain10 {
 
    public static void main(String[] args) {
        BinaryTreeArray10 bta = new BinaryTreeArray10();
        Mahasiswa10 mhs1 = new Mahasiswa10("244106121", "Ali", "A", 3.57);
        Mahasiswa10 mhs2 = new Mahasiswa10("244106221", "Badar", "B", 3.85);
        Mahasiswa10 mhs3 = new Mahasiswa10("244106185", "Candra", "C", 3.21);
        Mahasiswa10 mhs4 = new Mahasiswa10("2441060220", "Dewi", "B", 3.54);

        Mahasiswa10 mhs5 = new Mahasiswa10("244106131", "Devi", "A", 3.72);
        Mahasiswa10 mhs6 = new Mahasiswa10("244106205", "Ehsan", "D", 3.37);
        Mahasiswa10 mhs7 = new Mahasiswa10("244106170", "Fizi", "B", 3.46);

        Mahasiswa10[] dataMahasiswa = {mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,null,null,null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa,idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}