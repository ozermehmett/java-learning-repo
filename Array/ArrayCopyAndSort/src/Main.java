import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] doldur(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        return array;
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Eleman: " + array[i]);
        }
    }

    public static void arraySort(int[] array){
        Arrays.sort(array);
        showArray(array);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array uzunluğu gir: ");
        int sayi = scanner.nextInt();

        int[] a = new int[sayi];

         //showArray(doldur(a));
         //arraySort(doldur(a));
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};


        if (a1 == a2){
            System.out.println("Eşitler");
        }else {
            System.out.println("Eşit değiller");
        }


        if (Arrays.equals(a1, a2)){
            System.out.println("Eşitler");
        }else {
            System.out.println("Eşit değiller");
        }

    }
}