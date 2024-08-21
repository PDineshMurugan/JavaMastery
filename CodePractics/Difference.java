package CodePractics;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive, count = 0;
        System.out.println("enter Number:");
        int n = sc.nextInt();
        System.out.println("enter difference:");
        int diff = sc.nextInt();
        System.out.println("enter length of array:");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("enter the arrays:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            positive = arr[i] - n;
            if (positive <= diff) {
                if (positive < 0) {
                    positive = positive * -1;
                }
                if (positive <= diff) {
                    System.out.println(arr[i]);
                }
            }
        }
        // System.out.println(count);

    }
}
