import java.util.ArrayList;

public class ListInterface {
    public static void main(String[] args) {
        
        long startTime = System.nanoTime();

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Lexus");

        System.out.println(cars);
        System.out.println(cars.get(1));

        cars.set(2, "Ford");
        cars.remove(1);
        System.out.println(cars);

        // cars.removeAll(cars); or cars.clear();
        System.out.println(cars.size());

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

    }

}