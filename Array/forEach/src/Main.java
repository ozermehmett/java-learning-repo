public class Main {
    public static void main(String[] args) {
        String[] array = {"Armut", "Elma", "Kiraz"};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Deneme[] array3 = {new Deneme("Mehmet"), new Deneme("Özer")};

        /*
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }*/
        for (String a : array){
            System.out.println(a);
        }

        for (int i : array2){
            System.out.println(i);
        }

        for (Deneme d : array3){
            System.out.println(d);
            d.yaz();
        }


    }
}