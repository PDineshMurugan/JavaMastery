package Possiblefomration;

import java.util.Scanner;

public class wordpossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the single word");
        String str = sc.next();
        int n = str.length();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    i++;
                    break;
                }
            }
            if (arr[i] == 0) {
                arr[i]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += arr[i];
        }
        fact(ans);

        sc.close();
    }

    private static void fact(int ans) {
        int fact = 1;
        for (int i = 1; i <= ans; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
