package CodePractics;

import java.util.Scanner;

class AsciiPrime {
    public int isPrime(int arr) {
        if (arr % 2 == 0) {
            return 0;
        } else {
            for (int i = 3; i < arr / 2; i++) {
                if (arr % i == 0) {
                    return 0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AsciiPrime as = new AsciiPrime();
        String str = sc.nextLine();
        int len = str.length();
        int arr[] = new int[len];
        String strcon = "";
        int ascii, total = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = str.charAt(i);
            // System.out.println(arr[i]);
            ascii = as.isPrime(arr[i]);
            if (ascii > 0) {
                total = total + ascii;
                strcon = strcon + str.charAt(i);
            }
        }
        System.out.println(strcon + ":" + total);

    }

}
