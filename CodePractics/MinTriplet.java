package CodePractics;

import java.util.Scanner;

public class MinTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int arr3[] = new int[n];
        System.out.println(" enter the elements in array 1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr3[i] = sc.nextInt();
        }
        System.out.println(Triplet(arr1) + " " + Triplet(arr2) + " " + Triplet(arr3));

    }

    public static int Triplet(int arr[]) {

        return 0;
    }
}
