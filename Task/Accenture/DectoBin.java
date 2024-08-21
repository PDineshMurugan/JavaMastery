package Task.Accenture;

import java.util.Scanner;

public class DectoBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Convertion Type:\n1.Binary to Decimal\n2.decimal to binary");
        // decimal to binary

        int arr[] = new int[10];
        int i = 0, len = 0;
        DectoBin tk = new DectoBin();
        while (n > 0) {
            arr[i] = n % 2;
            n = n / 2;

            System.out.print(arr[i]);
            i++;
            len++;
        }
        System.out.println();
        len = len - 1;
        int bin[] = new int[10];
        int j = 0;
        --i;
        for (; i >= 0; i--) {

            bin[j] = arr[i];

            System.out.print(" " + bin[j]);
            j++;
        }

    }

}