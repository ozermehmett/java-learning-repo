public class Main {
    public static boolean asalMi(int n) {
        for (int i = 2; i < n; i ++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (asalMi(i)) {
                System.out.println(i);
            }
        }


    }
}