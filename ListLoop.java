import java.util.ArrayList;

public class ListLoop {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Lexus");

        // $Loop using simple `for` loop

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }

        // $Loop using `for-each` loop
        System.out.println();
        for (String iString : cars) {
            System.out.print(iString + " ");
        }
    }
}
