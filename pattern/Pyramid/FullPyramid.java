package pattern.Pyramid;

import java.util.Scanner;

public class FullPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == k / 2) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
