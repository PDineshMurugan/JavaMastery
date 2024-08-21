package pattern.UpRightTriangle;

import java.util.*;

public class OneZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {

                if (i % 2 == 0) {
                    if (j % 2 != 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println("");
        }

    }
}
