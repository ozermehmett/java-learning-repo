import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        do {
            //kosul dogru oldugu surece
            //while dan farkı en az bir kere calismasinin garanti olmasi
         }while (kosul);

         */

        /*
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;

        }while (i < 5);

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        int total = 0;
        do {
            total += num%10;
            num /= 10;

        }while (num > 0);
        System.out.println("Rakamları toplamı = " + total);

    }
}