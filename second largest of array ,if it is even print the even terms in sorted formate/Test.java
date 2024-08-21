
//find the second largest of array ,if it is even print the even terms in sorted formate
import java.util.Scanner;
import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        int even[] = new int[4];
        int odd[] = new int[4];
        int large = 0, second = 0, evenCount = 0, oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            } else {
                odd[oddCount++] = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > large) {
                second = large;
                large = arr[j];
            } else if (arr[j] > second && arr[j] != large) {
                second = arr[j];
            }
        }
        System.out.println("Second:" + second);
        Arrays.sort(even, 0, evenCount);
        Arrays.sort(odd, 0, oddCount);
        if (second % 2 == 0) {

            int m;
            for (m = 0; m < evenCount; m++) {
                System.out.print(even[m] + " ");
            }

            for (m = 0; m < oddCount; m++) {
                System.out.print(odd[m] + " ");
            }
        }

        else {
            int k;
            for (k = 0; k < oddCount; k++) {
                System.out.print(odd[k] + " ");
            }
            for (k = 0; k < evenCount; k++) {
                System.out.print(even[k] + " ");
            }

        }
    }
}
