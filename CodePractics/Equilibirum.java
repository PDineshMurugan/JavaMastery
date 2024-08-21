package CodePractics;

import java.util.Scanner;

public class Equilibirum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 0;
        int arr[] = new int[n];
        // initiallizing
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //
        int j = 0;
        for (int i = 0; i < n; i++) {
            int right = 0;
            for (j = 0; j <= i; j++) {
                right = arr[j] + right;
            }
            int left = 0;
            for (j = i; j < n; j++) {
                left = left + arr[j];
            }

            if (left == right) {
                index = i + 1;
                System.out.println("equlaibirum point:" + (index));
            }
        }
        if (index > 0) {

        } else {

            System.out.println("-1");
        }
    }

}
