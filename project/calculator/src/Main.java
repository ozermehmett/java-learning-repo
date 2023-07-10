import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************");
        String islemler = "1. Toplama\n"
                + "2. Çıkarma\n"
                + "3. Çarpma\n"
                + "4. Bölme";
        System.out.println(islemler);
        String islem = scanner.nextLine();
        int a;
        int b;
        switch (islem) {
            case "1":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("İşlem sonucu: " + (a+b) );
                break;
            case "2":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("İşlem sonucu: " + (a-b) );
                break;
            case "3":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("İşlem sonucu: " + (a*b) );
                break;
            case "4":
                System.out.println("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("İşlem sonucu: " + (a/b) );
                break;
            default:
                System.out.println("Hata!!");
                break;
        }


    }
}