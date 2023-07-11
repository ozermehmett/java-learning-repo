import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        if (koşul) {
            koşul sağlanınca(true) bu blok çalışır.
        }

        else if (başka bir koşul) {
            koşul sağlanınca(true) bu blok çalışır.
        }

        else if (başka bir koşul) {
            koşul sağlanınca(true) bu blok çalışır.
        }

        else {
            bu blok üstündeki herhangi bir koşul sağlanmadığında çalışır.
        }
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen işlem giriniz: ");
        int islem = scanner.nextInt();

        if (islem == 1) {
            System.out.println("1. işlem");
        }
        else if (islem == 2) {
            System.out.println("2. işlem");
        }
        else if (islem == 3) {
            System.out.println("3. işlem");
        }
        else if (islem == 2) {
            System.out.println("4. işlem");
        }
        else {
            System.out.println("Işlem seçilemedi");
        }

    }
}