import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleriBastir(){
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-ŞArkıcı ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı sil");
        System.out.println("\t 5-ŞArkıcı ara");
        System.out.println("\t 6-Exit");
    }

    public static void goruntule(){
        sarkicilar.showSarkici();
    }

    public static void sarkiciEkle(){
        System.out.print("Eklemek istediğiniz şarkıcının ismini giriniz: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }

    public static void sarkiciGuncelle(){
        System.out.print("Güncellemek istediğiniz pozisyon(1, 2, 3): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        String isim = scanner.nextLine();
        sarkicilar.sarkiciGuncelle(isim, index-1);
    }

    public static void sarkiciSil(){
        System.out.print("Silmek istediğiniz index: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        sarkicilar.sarkiciSil(index-1);
    }

    public static void sarkiciAra(){
        System.out.print("Aramak istediğiniz şarkıcının adını giriniz: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciAra(isim);
    }

    public static void main(String[] args) {
        System.out.println("\t Şarkıcı uygulamasına hoşgeldiniz...");
        islemleriBastir();

        boolean cikis = false;

        int islem;

        while (!cikis){
            System.out.print("İşlem seçiniz: ");
            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem){
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sarkiciSil();
                    break;
                case 5:
                    sarkiciAra();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulama kapatılıyor...");
                    break;
            }
        }
    }
}
