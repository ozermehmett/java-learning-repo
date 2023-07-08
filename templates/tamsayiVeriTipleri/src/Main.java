public class Main {
    public static void main(String[] args) {
        /*
        // byte --> short --> int --> long
        int a = 4;   // -2^31 ve 2^31 arasi bir deger tutabilir
        byte b = 100;  // -128 ve 127 arasinda deger alir
        short c = 100; // 32767 ve -32768 arasinda deger alir
        long d = 100;   // cok buyuk sayi degerlerini tutabilir
        */

        /*
        short j = 1000;
        int i = (j / 2);

        byte a = 100;
        //byte b = (a / 2); hata byte dan byte a otomatik donusturme yok
        */

        short i = 200;
        byte j = 2;
        int k = 4;
        long d = i + j + k;
        System.out.println(d);


    }
}