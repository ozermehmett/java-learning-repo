import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Wrapper Class

        boolean --------> Boolean
        char --------> Character
        byte --------> Byte
        short --------> Short
        int --------> Integer
        long --------> Long
        float --------> Float
        double --------> Double

         */

        ArrayList<String> arrayList = new ArrayList<>();
        //ArrayList<int> arrayList1 = new ArrayList<int>(); //ilkel veri tipinde hata verir

        //Integer a = 5;
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            //arrayList1.add(Integer.valueOf(i*4)); //Autoboxing

            arrayList1.add(i*4);  //java kendisi yapıyor
        }

        for (int i = 0; i < arrayList1.size(); i++){
            //System.out.println(arrayList1.get(i).intValue());  //Unboxing

            System.out.println(arrayList1.get(i)); //jaav kendisi yapıyor
        }
    }
}