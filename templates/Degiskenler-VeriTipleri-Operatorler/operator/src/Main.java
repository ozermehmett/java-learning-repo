public class Main {
    public static void main(String[] args) {
        /*
        + : Toplama
        - : Çıkarma
        / : Bölme
        * : Çarpma
        % : Kalan
        */


        System.out.println(4 + 5.2);
        System.out.println(10 / 4);
        System.out.println(10d / 4);  // Kesieli elde etmek için veri tiplerine dikkat et
        System.out.println(10 % 4);



        int a = 4;
        a -= 2;
        a *= 3;
        a++;
        System.out.println(a);


        int a = 8;
        int b = 8;
        System.out.println(++a); //once gunceller
        System.out.println(b++); //sonra gunceller
    }
}