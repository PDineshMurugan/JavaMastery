package CodePractics;

import java.util.Scanner;

public class ABCofBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int arr[] = new int[str.length()];
        int output = 0, i = 0;

        for (i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
            // switch
            switch (str.charAt(i)) {
                case 'A':
                    output = arr[i - 1] & arr[i + 1];
                    arr[i + 1] = output;
                    i++;
                    break;
                case 'B':
                    output = arr[i - 1] | arr[i + 1];
                    arr[i + 1] = output;
                    i++;
                    break;
                case 'C':
                    output = arr[i - 1] ^ arr[i + 1];
                    arr[i + 1] = output;
                    i++;
                    break;

                default:
                    break;
            }
        }
        System.out.println(arr[i]);

    }
}
