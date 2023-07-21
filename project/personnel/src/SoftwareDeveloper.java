public class SoftwareDeveloper extends Employee{
    private String languages;

    public SoftwareDeveloper(String name, String surname, int id, String languages) {
        super(name, surname, id);
        this.languages = languages;
    }

    public void formatOS(String OS) {
        System.out.println(getName() + " " +  "is installing operating system " + OS);
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Languages known by a programmer: " + languages);
    }
}
