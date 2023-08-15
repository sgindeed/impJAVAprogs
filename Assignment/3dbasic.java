public class ThreeDArrayExample {
    public static void main(String[] args) {
        // Define a 3D array
        int[][][] threeDArray = {
            { {1, 2}, {3, 4}, {5, 6} },
            { {7, 8}, {9, 10}, {11, 12} },
            { {13, 14}, {15, 16}, {17, 18} }
        };

        // Access and print elements of the 3D array
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
