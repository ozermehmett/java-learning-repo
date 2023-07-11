import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        while (dongu kosulu) {
            // kosul dogru oldugu surece calisir
         }
         */
        /*
        int i = 0;
        while (i < 100) {
            System.out.println("i = " + i);
            i += 3;
        }

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int fakt = 1;
        while (sayi > 0) {
            fakt *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel = " + fakt);
    }
}