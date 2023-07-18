public class Dog extends Animal {
    private int numberOfTeeth;

    public Dog(String name, int weight, int height, int numberOfLegs, int numberOfTeeth) {
        super(name, weight, height, numberOfLegs);
        this.numberOfTeeth = numberOfTeeth;
    }

    public void run(int v){
        System.out.println("The dog is running");
        super.walk(v);
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }
}
