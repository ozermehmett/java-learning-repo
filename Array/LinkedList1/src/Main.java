import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> diller = new ArrayList<>();

        diller.add("Python");
        diller.add("Java");
        diller.add("C++");
        diller.add("MATLAB");

        for (String i: diller){
            System.out.println(i);
        }
    }
}