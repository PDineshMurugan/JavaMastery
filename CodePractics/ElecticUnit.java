package CodePractics;

import java.util.Scanner;

public class ElecticUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        int sum = 0, i = 0;
        int ans = 0;
        // initilazing and sum of array;
        for (i = 0; i < arrlen; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        // System.out.println(sum3);
        int unitconsum = sum;
        if ((y * w) <= sum) {
            System.out.println();
            for (i = 0; i < arrlen; i++) {
                unitconsum = unitconsum - arr[i];
                if (unitconsum <= 0) {
                    ans = i - 1;
                    System.out.println(ans);
                    break;

                }
            }
        }
        if (ans == 0) {
            System.out.println("-1");
        }

    }
}
