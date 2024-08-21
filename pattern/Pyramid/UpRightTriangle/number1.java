package pattern.UpRightTriangle;

import java.util.*;

public class number1 {
    public static void main(String[] args) {
        int k = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
                k++;
            }
            System.out.println("");
        }

    }
}
