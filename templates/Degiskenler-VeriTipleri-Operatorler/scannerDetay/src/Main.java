import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nextInt ve nextDouble da kullanılıri line da gerek yoktur

        int yas = scanner.nextInt();
        scanner.nextLine();       //üstte ki enterı alır
        String isim = scanner.nextLine();

        System.out.println("Yaş: " + yas);
        System.out.println("İsim: " + isim);
    }
}