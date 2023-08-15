public class TwoDArrayExample {
    public static void main(String[] args) {
        // Define a 2D array with different numbers of columns in different rows
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Access and print elements of the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

