package pattern;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print("X");
                } else {
                    System.out.print("X_");
                }
            }
            if (i < n - 1) {
                System.out.println("");
            }
        }
    }
}
