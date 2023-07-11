import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 1000;
        String islemler = "\n1: Bakiye öğrenme\n" +
                "2: Para çekme\n" +
                "3: Para yatırma\n" +
                "q: Çıkış\n";
        System.out.println("*".repeat(20) + islemler + "*".repeat(20));
        while (true) {
            System.out.println("Işlem seçiniz: ");
            String islem = scanner.nextLine();
            System.out.println(islem);

            if (islem.equals("1")){
                System.out.println("Mevcut bakiyeniz: " + total);
            } else if (islem.equals("2")) {
                System.out.println("Lütfen çekmek istediğiniz miktarı giriniz, mevcut bakiye: " + total);
                int i = scanner.nextInt();
                scanner.nextLine();
                if (i > total) {
                    System.out.println("Yetersiz bakiye...");
                } else if (i < 0) {
                    System.out.println("Negatif bir bakiye çekemezsiniz...");
                } else {
                    total -= i;
                    System.out.println("Para çekme işlemi başarılı, kalan bakiye: " + total);
                }
            } else if (islem.equals("3")) {
                System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz: ");
                int j = scanner.nextInt();
                scanner.nextLine();
                if (j < 0) {
                    System.out.println("Negatif bir bakiye yatıramazsınız...");
                } else {
                    total += j;
                    System.out.println("Bakiye yatırma başarılı, güncel bakiye: " + total);
                }
            }else if (islem.equals("q")) {
                break;
            }else {
                System.out.println("Geçersiz işlem...");
            }
        }


    }
}