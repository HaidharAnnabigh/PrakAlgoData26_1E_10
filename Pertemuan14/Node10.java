package Pertemuan14;
 
public class Node10 {

    Mahasiswa10 mahasiswa;
    Node10 right, left;

    public Node10() {
    }

    public Node10(Mahasiswa10 mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}