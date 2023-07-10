import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas = scanner.nextInt();
        System.out.println("Yaşınız: " + yas);

        ----->
        Lütfen yaşınızı giriniz:
        3
        Yaşınız: 3

         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz:");
        double sayi = scanner.nextDouble();
        System.out.println("Girdiğiniz sayı: " + sayi);

        ----->
        Lütfen yaşınızı giriniz:
        4
        Yaşınız: 4.0
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz:");
        String str = scanner.nextLine();
        System.out.println("String: " + str);
         */

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int sayi = scanner.nextInt();
            System.out.println("Sayı: " + sayi);
        }
        else{
            System.out.println("Lütfen bir sayı giriniz.....!!!!");
        }
    }
}