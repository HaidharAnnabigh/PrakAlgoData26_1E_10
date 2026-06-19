package Pertemuan15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Satu");
        l.add("Dua");
        l.add("Tiga");
        l.add("Cireng");

        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        l.add("Empat");
        l.remove(0);

        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());

        // System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
        //         names.get(0), names.size(), names.get(names.size() - 1));

        // names.set(0, "My kid");

        // System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
        //         names.get(0), names.size(), names.get(names.size() - 1));

        // System.out.println("Names: " + names.toString());
    }
}