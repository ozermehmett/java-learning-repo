public class Account {
    private String userName;
    private String password;
    private int balance;

    public Account(String userName, String password, int balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addBalance(int amounts) {
        this.balance = amounts;
        System.out.println("Güncel bakiyeniz: " + balance);
    }

    public void checkBalance(int amounts) {
        if (amounts <= balance) {
            this.balance -= amounts;
            System.out.println("Güncel bakiyeniz: " + balance);
        } else {
            System.out.println("Yetersiz bakiye!!");
        }

    }
}
