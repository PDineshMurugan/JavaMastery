package pattern.Pyramid.UpRightTriangle;

import java.util.*;

public class number {
    public static void main(String[] args) {
        int k = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println("");
        }

    }
}
