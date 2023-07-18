public class Employee { //SuperClass or BaseClass
    private String name;
    private int wage;
    private String department;

    public Employee(String name, int wage, String department) {
        this.name = name;
        this.wage = wage;
        this.department = department;
    }
    public void work(){
        System.out.println("The employee is working...");
    }
    public void showInformation(){
        System.out.println("Name: " + name);
        System.out.println("Wage: " + wage);
        System.out.println("Department: " + department);
    }
    public void changeDepartment(String newDepartment){
        System.out.println("The department is changed...");
        this.department = newDepartment;
        System.out.println("New Department: " + department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
