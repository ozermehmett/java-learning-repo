public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Account account = new Account("Mehmet Özer", "12345678", 1000);
        atm.work(account);
    }
}