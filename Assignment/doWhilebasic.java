import java.util.Scanner;

public class DoWhileLoopProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter positive integers. Enter a negative number to stop.");
        
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                break; // Exit the loop when a negative number is entered
            }

            sum += number;
        } while (true);

        System.out.println("Sum of the positive numbers entered: " + sum);

        scanner.close();
    }
}
