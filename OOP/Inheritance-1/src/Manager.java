public class Manager extends Employee { //SubClass
    private int responsiblePerson;

    public Manager(String name, int wage, String department, int responsiblePerson) {
        super(name, wage, department);
        this.responsiblePerson = responsiblePerson;
    }
    public void giveRaise(int amount){
        System.out.println("The salaries were increased by" + amount + "TL.");
    }
    public void showInformation(){
        System.out.println("Name: " + getName());
        System.out.println("Wage: " + getWage());
        System.out.println("Department: " + getDepartment());
        System.out.println("The responsible person: " + responsiblePerson);

        System.out.println("\n****************************\n");

        super.showInformation();

    }
}
