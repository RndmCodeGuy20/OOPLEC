import java.util.ArrayList;

public class ListInterface {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Lexus");

        System.out.println(cars);
        System.out.println(cars.get(1));

        cars.set(2, "Ford");
        System.out.println(cars);

        // cars.removeAll(cars); or cars.clear();
        System.out.println(cars.size());
    }
}