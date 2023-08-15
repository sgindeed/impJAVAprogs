import java.util.Scanner;

public class ForLoopTriangleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the triangle: ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
