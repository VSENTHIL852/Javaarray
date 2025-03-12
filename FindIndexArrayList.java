import java.util.ArrayList;

public class FindIndexArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Finding index of an element
        int index = numbers.indexOf(30);
        System.out.println("Index of 30: " + index); // Output: 2

        // Trying to find an element that does not exist
        int notFound = numbers.indexOf(100);
        System.out.println("Index of 100: " + notFound); // Output: -1
    }
}
