import java.util.Scanner;

public class Main {

    public static void fact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int n = scanner.nextInt();
        int f = 1;
        for (; n > 0; n--) {
            f *= n;
        }
        System.out.println("Faktöriyel: " + f);
    }

    public static void main(String[] args) {
        /*
        Erişim_Belirleyici (opsiyonel) ekstra_özellikler dönüş_Tipi Fonksiyon_adı(parametreler) {
            // burası fonk bloğu
            // Fonksiyonun yapacağı işlemler
        }
         */
        fact();
    }
}