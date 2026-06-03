package Pertemuan14;

public class BinaryTreeMain10 {
 
    public static void main(String[] args) {
        BinaryTree10 bst = new BinaryTree10();

        bst.add(new Mahasiswa10("244106121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa10("244106221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa10("244106185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa10("2441060220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua Mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54)? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22)? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa10("244106131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa10("244106205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa10("244106170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}