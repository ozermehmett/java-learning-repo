public class Main {
    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Eleman: " + (i+1) + ": " + array[i]);
        }
    }


    public static double ortBul(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        return (total / (array.length));
    }


    public static void main(String[] args) {
        //int[] a;
        //double[] b;
        //String[] c;

        int[] a = new int[10];
        /*a[5] = 32;
        a[9] = 31;*/
        int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        /*for (int i = 9; i >= 0; i--){
            System.out.println(b[i]);
        }*/

        System.out.println("Array in uzunluğu: " + b.length);

        showArray(b);
        System.out.println("Listenin elemanlarının ortalaması: " + ortBul(b));
    }
}