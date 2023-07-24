import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String a = "Mehmet";

        String b = new String("Mehmet");

        //System.out.println("Stringin boyu: " + b.length());

        // b[3]; // Hatalıı
        //b.charAt(index);  //doğru gösterim

        //System.out.println(b.charAt(1));

        /*for (int i = 0; i < b.length(); i++){
            System.out.println(b.charAt(i));
        }*/


        /*System.out.println(b.startsWith("Me"));
        System.out.println(b.endsWith("v"));*/

        //System.out.println(b.indexOf("e"));
        //System.out.println(b.lastIndexOf("e"));

        //System.out.println(b.toLowerCase());
        //System.out.println(b.toUpperCase());

        /*String c = "2023";
        int d = Integer.parseInt(c);

        int e = 2023;
        String f = String.valueOf(e);*/

        /*String a1 = "Mehmet";
        String a2 = "Mehmet";
        if (a1 == a2){
            System.out.println("Eşitler");  // ---------->Eşitler
        }*/

        String b1 = new String("Mehmet");
        String b2 = new String("Mehmet");

        if (b1 == b2){
            System.out.println("Eşitler");  // ------------> farklı
        }
        if (b1.equals(b)){
            System.out.println("içerkleri Eşit");  // ---------->İçerikleri eşit
        }
    }
}