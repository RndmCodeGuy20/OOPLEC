import java.util.Iterator;
import java.util.LinkedList;

public class ListLinked {

    /**
     * $How the ArrayList works
     * 
     * The ArrayList class has a regular array inside it. When an element is added,
     * it is placed into the array. If the array is not big enough, a new, larger
     * array is created to replace the old one and the old one is removed.
     * 
     * $How the LinkedList works
     * 
     * The LinkedList stores its items in "containers." The list has a link to the
     * first container and each container has a link to the next container in the
     * list. To add an element to the list, the element is placed into a new
     * container and that container is linked to one of the other containers in the
     * list.
     * 
     */

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Nissan");
        cars.add("Toyota");

        System.out.println(cars);

        cars.addFirst("Audi");
        cars.addLast("Bugatti");

        System.out.println(cars);

        cars.removeFirst();
        cars.removeLast();

        System.out.println(cars);

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

        Iterator<String> dit = cars.descendingIterator();

        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
    }
}
