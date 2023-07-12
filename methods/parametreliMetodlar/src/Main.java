import java.util.Scanner;

public class Main {
    public static void fact(int n) {
        int f = 1;
        for (; n > 0; n--) {
            f *= n;
        }
        System.out.println("Faktöriyel: " + f);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int n = scanner.nextInt();
        fact(n);

    }
}