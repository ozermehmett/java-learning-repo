import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ops = "Ops...\n"
                + "1: Developer operations (DevOps) processes.\n"
                + "2: Managerial operations (Management) processes.\n"
                + "q: Exit";
        System.out.println("******************************");
        System.out.println(ops);
        System.out.println("******************************");

        while (true){
            System.out.print("Choose an operation");
            String op = scanner.nextLine();

            if (op.equals("q")){
                System.out.println("Exiting");
                break;
            } else if (op.equals("1")) {
                SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper("Mehmet", "Özer", 10,"Python, C++, Java(Beginner)");
                String ops1 = "1: Format\n"
                        + "2: Show Information\n"
                        + "q: Exit";
                System.out.println(ops1);
                while (true){
                    System.out.print("Choose an op: ");
                    String op2 = scanner.nextLine();

                    if (op2.equals("q")){
                        System.out.println("Exiting");
                        break;
                    } else if (op2.equals("1")) {
                        System.out.print("OS: ");
                        String OS = scanner.nextLine();
                        softwareDeveloper.formatOS(OS);

                    } else if (op2.equals("2")) {
                        softwareDeveloper.showInformation();
                    }else {
                        System.out.println("Invalid operation");
                    }

                }
            } else if (op.equals("2")) {
                Manager manager = new Manager("Mehmet", "Özer", 11, 10);

                String op2 = "Managerial operations"
                        + "1: Give a raise"
                        + "2: Display information"
                        + "q: Exit";
                System.out.println(op2);

                while (true){
                    System.out.print("Choose an operation: ");
                    String op3 = scanner.nextLine();

                    if (op3.equals("q")){
                        System.out.println("Exiting");
                        break;
                    } else if (op3.equals("1")) {
                        System.out.print("Please enter the amount of raise: ");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        manager.giveRise(amount);
                    } else if (op3.equals("2")) {
                        manager.showInformation();
                    } else {
                        System.out.println("Invalid operation");
                    }
                }
            }else {
                System.out.println("Invalid operation");
            }
        }
    }
}