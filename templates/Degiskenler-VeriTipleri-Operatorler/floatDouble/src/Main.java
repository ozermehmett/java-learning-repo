public class Main {
    public static void main(String[] args) {
        // Double : 64 bit - 8 byte
        // Float : 32 bit - 4 byte

        //Otomatik dönüştürme : int --> float --> double

        /*
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;
         */

        /*
        float a = (float) 5.0;
        float b = 5f;
        float c = 5.2f;
         */

        /*
        int a = 22 / 7;
        float b = 22f / 7f;
        double c = 22d / 7d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
         */

        /*
        double i = 3.52;
        float j = (float) i;
         */


        double sayi1 = 70.25;
        double sayi2 = 60d;
        double sayi3 = 80.2;
        System.out.println((sayi1 + sayi2 + sayi3) / 3);


        float a = 70.25f;
        float b = 60f;
        float c = 80.2f;
        System.out.println((a + b + c) / 3);

    }
}
