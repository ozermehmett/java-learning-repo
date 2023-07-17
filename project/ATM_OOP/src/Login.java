import java.util.Scanner;

public class Login {
    public boolean login(Account account) {
        Scanner scanner = new Scanner(System.in);

        String userName;
        String password;

        System.out.print("Username: ");
        userName = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();

        if (account.getUserName().equals(userName) && account.getPassword().equals(password)) {
            return true;
        }else {
            return false;
        }
    }
}
