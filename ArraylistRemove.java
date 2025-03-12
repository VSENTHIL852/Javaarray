import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistRemove{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 30, 50));

        System.out.println("Original: " + numbers);
        numbers.remove(Integer.valueOf(30)); // Removes the FIRST occurrence of 30
        System.out.println("After Removal: " + numbers);
    }
}
