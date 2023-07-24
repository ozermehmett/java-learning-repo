import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void show(LinkedList<String> gidilecekYerler){
        /*for (String i : gidilecekYerler){
            System.out.println(i);
        }*/

        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void siraliEkle(LinkedList<String> gidilecekYerler, String yeni){
        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni);

            if (karsilastir == 0){
                //iki değer eşit
                System.out.println("Listede bu eleman ztn var..");
                return;
            } else if (karsilastir < 0) {
                //yeni değer iterator.next ten daha büyükse
                System.out.println();
            } else if (karsilastir > 0) {
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);

    }

    public static void main(String[] args) {
        LinkedList<String> gidilecekYerler = new LinkedList<>();

        siraliEkle(gidilecekYerler, "Market");
        siraliEkle(gidilecekYerler, "Cami");
        siraliEkle(gidilecekYerler, "Ev");
        siraliEkle(gidilecekYerler, "Mutfak");
        siraliEkle(gidilecekYerler, "Tuvalet");
        /*
        gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kütüphane");
        gidilecekYerler.add("Ev");

        show(gidilecekYerler);

        System.out.println("*************");

        gidilecekYerler.add(4, "Tuvalet");

        show(gidilecekYerler);
        */


        show(gidilecekYerler);

    }
}