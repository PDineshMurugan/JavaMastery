package InterSectionAndUnion;

import java.util.*;

public class InterSectionAndUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the length of 1st array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the length of 2st array:");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // intersection
        for (i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[j]);
                }
            }
        }
        // Union
        System.out.println("");
        int k = m + n;
        int o = 0;
        int union[] = new int[n + m];
        for (i = 0; i < n; i++) {
            union[i] = arr1[i];
        }
        for (; i < k; i++) {
            if (union[o] == arr2[o]) {

            } else {
                union[i] = arr2[o++];
            }
        }
        for (i = 0; i < union.length; i++) {
            System.out.println(union[i]);
        }

    }
}
