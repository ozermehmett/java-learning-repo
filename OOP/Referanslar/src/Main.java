public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("123", 10000.0, "Mehmet ÖZER", "ozermehmet1@proton.me", "1234");

        Account account2 = account1;

        Account account3 = new Account();

        if (account1 == account2) {
            System.out.println("1 ve 2 aynı objeyi gösteriyolar");
        }
        if (account3 == account1) {
            System.out.println("1 ve 3 aynı objeyi gösteriyor");
        }
    }
}