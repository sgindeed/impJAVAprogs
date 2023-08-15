import java.util.Scanner;

public class FloatInputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a float number: ");
        float number = scanner.nextFloat();

        System.out.println("You entered: " + number);

        // Perform some calculations
        float squared = number * number;
        float cubed = number * number * number;
        float squareRoot = (float) Math.sqrt(number);

        System.out.println("Squared: " + squared);
        System.out.println("Cubed: " + cubed);
        System.out.println("Square root: " + squareRoot);

        scanner.close();
    }
}
