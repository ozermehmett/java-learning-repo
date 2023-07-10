import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one;
        int two;

        System.out.println("Birinci Sayı: ");
        one = scanner.nextInt();
        System.out.println("İkinci Sayı: ");
        two = scanner.nextInt();

        System.out.println("----------Değiştirmeden önce---------");

        System.out.println("Birinci Sayı " + one + " İkinci Sayı " + two);

        int gecici = one;
        one = two;
        two = gecici;


        System.out.println("----------Değiştirdikten sonra---------");

        System.out.println("Birinci Sayı " + one + " İkinci Sayı " + two);
        
    }
}