import java.util.HashSet;
import java.util.Iterator;

public class SetHash {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>(); // $Every item is unique. Item is treated as an object.

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.remove("BMW");

        System.out.println(cars);
        System.out.println(cars.contains("Mazda") + " " + cars.contains("Benz") + " " + cars.size());   
        // *Searching is easier in HashSet.

        Iterator<String> ite = cars.iterator();

        while (ite.hasNext()) {
            System.out.print(ite.next() + " ");
        }


        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
