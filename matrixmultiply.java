import java.util.Scanner;

public class MatrixMultiplication {
  public static void main(String args[]) {
    int n;
    //object of scanner class
    Scanner input = new Scanner(System.in);

    //input base (number of rows and cols)
    System.out.print("Enter the base the matrices : ");
    n = input.nextInt();

    //create two_D array (matrix) objects
    int[][] a = new int[n][n];
    int[][] b = new int[n][n];
    int[][] c = new int[n][n];

    //input matrix 1
    System.out.println("Enter the elements of 1st Matrix row wise \n");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = input.nextInt();
      }
    }

    //input matrix 2
    System.out.println("Enter the elements of 2nd mrtix row wise \n");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        b[i][j] = input.nextInt();
      }
    }

    //multiplication logic
    System.out.println("Multiplying both sthe matrices...");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          c[i][j] = c[i][j] + a[i][k] * b[k][j];
        }
      }
    }

    //print final/result matrix 
    System.out.println("The product of the matrices is : ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
    input.close();
  }
}
