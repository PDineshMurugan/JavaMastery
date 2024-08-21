package Task.Accenture;

import java.util.Scanner;

public class BintoDec {

    public int power(int num, int power) {
        if (num == 0) {
            return 0;
        }
        if (power == 0) {
            return 1;
        }
        for (int i = 0; i < power; i++) {
            num = 2 * num;
        }
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        BintoDec pow = new BintoDec();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number to convert to decimal: ");
        String binaryno = sc.next();
        int n = binaryno.length();
        int[] binarr = new int[n];
        int m = n;
        for (int i = 0; i < m; i++) {
            n--;
            binarr[i] = binaryno.charAt(n) - '0';
            System.out.println(binarr[i]);
        }
        // binary to decimal

    }
}
