package Instagram;

import java.util.Scanner;

public class newpatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int j;
        int o = n;
        int x = 1, inc = 1;
        for (int i = 0; i < o; i++) {
            int k = n;

            for (j = 0; j < n; j++) {

                if (i < 2 && j == 0) {
                    System.out.print("_");

                }

                System.out.print(x + " ");
                k--;
                x += k + 1;

            }
            if (i < 2 && j == 0) {

            } else {
                x = 1;
                inc++;
                x = inc;
                n--;
                System.err.println("");
            }
        }
    }
}
