package pattern;

import java.util.Scanner;

public class UpperRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (j == n) {
                    System.out.print("X");
                } else {
                    System.out.print("X_");
                }
            }
            if (i != n) {
                System.out.println();
            }

        }
    }
}
