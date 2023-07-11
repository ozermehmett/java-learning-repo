import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        for (baslatma; kosul; artırma veya azaltma islemi) {
              dongu kosulumuz dogru oldugu surece burası calısacak
         }
         */
        /*
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
         */

        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
         */
        /*
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }

         */
        /*
        int i = 0;
        for (; i < 5; i++) {
            System.out.println("Deneme");
        }

         */
        /*
        int i = 0;
        int j = 10;
        for (; i < 10 && j > 0; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }

         */
        /*
        for (int i = 2; i < 100; i *= 2) {
            System.out.println(i);
        }

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int fakt = 1;
        for (int n = 1;n <= sayi; n++) {
            fakt *= n;
        }
        System.out.println(fakt);
    }
}