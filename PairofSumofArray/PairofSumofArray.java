package PairofSumofArray;

import java.util.Scanner;
/*
 Write a java program to find the pair of elements(X+Y) in the array whose sum is equal to given number Z.

 */

class PairofSumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter the Z number:");
        int z = sc.nextInt();
        int i = 0;
        int arr[] = new int[n];
        System.out.println("Enter the Elements of array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] + arr[j] == z) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

    }
}
