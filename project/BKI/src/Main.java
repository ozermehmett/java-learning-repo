import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu giriniz(Örnek: 1,85): ");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);

        System.out.println("Boy kilo endeksiniz: " + bki);

    }
}