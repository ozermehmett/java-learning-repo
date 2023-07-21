public class Manager extends Employee{
    private int numberOfPersons;

    public Manager(String name, String surname, int id, int numberOfPersons) {
        super(name, surname, id);
        this.numberOfPersons = numberOfPersons;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Number of individuals managed by the manager: " + numberOfPersons);
    }

    public void giveRise(int amount){
        System.out.println("Person " + getName() + " gave the employees a raise of"  + amount + " amount.");
    }
}
