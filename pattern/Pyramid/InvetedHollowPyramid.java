package pattern.Pyramid;

import java.util.Scanner;

//inveted hollow pyramid
public class InvetedHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j == i)
                    System.out.print("*");
                else if (j == n) {
                    System.out.print(" *");
                } else {
                    if (i == 1) {
                        System.out.print(" *");
                    } else {
                        if (j > i) {
                            System.out.print(" _");
                        } else {
                            System.out.print("_");
                        }
                    }
                }
            }
            System.out.println();

        }
    }
}
