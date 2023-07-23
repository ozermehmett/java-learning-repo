import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Özerus");
        arrayList.add("Iron Man");

        System.out.println(arrayList.get(1));   //.get verilen indeksi döndürür

        System.out.println(arrayList.size());   // .size boyunu verir

        arrayList.remove(1); // .remove ya index ver ya da elemanı
        System.out.println(arrayList);

        // .indexOf verilen elemanın indeksini döndürür
        // .lastIndexOf verilen elemanın sondan indeksini döndürür
        // .set(int index, String new element);
    }
}