import java.util.Scanner;

public class ATM {
    public void work(Account account){
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Welcome to the bank *****");
        System.out.println("*********************");
        System.out.println("User login");
        System.out.println("*********************");

        int rightOfAdmission = 3;

        while (true) {
            if (login.login(account)){
                System.out.println("Login successful...");
                break;
            }else {
                System.out.println("Login failed...");
                rightOfAdmission -= 1;
                System.out.println("Remaining admission: " + rightOfAdmission);
            }
            if (rightOfAdmission == 0) {
                System.out.println("Your admission has expired...");
                return;
            }


        }
        System.out.println("**************************");
        String operations = "\n1: Check balance\n" +
                "2: Withdraw money\n" +
                "3: Deposit money\n" +
                "q: Exit\n";
        System.out.println(operations);
        System.out.println("**************************");

        while (true) {
            System.out.print("Select an operation: ");
            String operation = scanner.nextLine();
            if (operation.equals("q")){
                break;
            } else if (operation.equals("1")) {
                System.out.println("Your balance: " + account.getBalance());
            } else if (operation.equals("2")) {
                System.out.print("Enter the amount you want to deposit: ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                account.addBalance(amount);
            } else if (operation.equals("3")) {
                System.out.println("Enter the amount you want to withdraw: ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                account.checkBalance(amount);
            } else {
                System.out.println("Invalid operation...");
            }
        }
    }
}
