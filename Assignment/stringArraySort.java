import java.util.Arrays;

public class StringArraySorting {
    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "orange", "grape", "pear"};

        System.out.println("Original String Array:");
        for (String fruit : stringArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        Arrays.sort(stringArray);

        System.out.println("Sorted String Array:");
        for (String fruit : stringArray) {
            System.out.print(fruit + " ");
        }
    }
}
