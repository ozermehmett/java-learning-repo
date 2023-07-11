import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        if (koşul) {
            koşul sağlanınca(true) bu blok çalışır.
        }

        else {
            bu blok üstündeki herhangi bir koşul sağlanmadığında çalışır.
        }
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        if (yas < 18) {
            System.out.println("Bu mekana giremezsin kardeş");
        }
        else {
            System.out.println("Buyur kardeş gir");
        }
    }
}