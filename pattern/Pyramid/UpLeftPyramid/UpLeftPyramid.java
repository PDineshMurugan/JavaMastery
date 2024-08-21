package UpLeftPyramid;

import java.util.Scanner;

public class UpLeftPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - k) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            k++;
            System.out.println("");
        }
    }
}
