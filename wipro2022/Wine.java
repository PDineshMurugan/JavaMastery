package wipro2022;

public class Wine {
    public static void main(String[] args) {
        double l = 12, overflow = 0;
        int i = 4;
        int row, col;
        double[][] wine = new double[i][];
        for (row = 0; row < i; row++) {
            wine[row] = new double[row + 1];
        }
        wine[0][0] = l;

        for (row = 0; row < i - 1; row++) {
            for (col = 0; col <= row; col++) {
                if (wine[row][col] > 1) {
                    overflow = wine[row][col] - 1;
                    wine[row][col] = 1;
                }
                // if (wine[row + 1] == null) {
                // wine[row + 1] = new int[i + 2];
                // }
                wine[row + 1][col] += overflow / 2.0;
                wine[row + 1][col + 1] += overflow / 2.0;
            }
        }
        for (row = 0; row < i; row++) {
            for (col = 0; col <= row; col++) {
                System.out.print(wine[row][col]);
            }
            System.out.println(" ");
        }

    }
}
