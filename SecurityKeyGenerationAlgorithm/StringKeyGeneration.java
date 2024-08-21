
/**
 * StringKeyGeneration
 * Example 1:
 * o Input: Word1 = "WIPRO", Word2 = "TECHNOLOGIES"
 * o Splitting:
 * ▪ Word1: "W", "IPR", "O"
 * ▪ Word2: "TECH", "NOLO", "GIES"
 * o Output Security Key: "TECHWOGIES"
 * • Example 2:
 * o Input: Word1 = "MACHINE", Word2 = "LEARNING"
 * o Splitting:
 * ▪ Word1: "MA", "CHI", "NE"
 * ▪ Word2: "LE", "ARNI", "NG"
 * o Output Security Key: "LEMANENG"
 */
import java.util.*;

public class StringKeyGeneration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        int len1 = word1.length();
        int len2 = word2.length();

        String arr[] = new String[25];
        int i = 0, j, n = 0, k = 0;
        int newlen1 = 0, newlen2 = 0;
        // System.out.println(len1);
        if (len1 % 3 == 0) {
            n = len1 / 3;
            // for (j = 0; j < len1; j += 3) {
            // arr[i] = word1.substring(j, n);
            // n = n + 3;
            // i++;
            // }
            newlen1 = len1 - n;
            arr[k] = word1.substring(k, n);
            arr[k + 1] = word1.substring(n, newlen1);
            arr[k + 2] = word1.substring(newlen1, len1);
            k = 3;

            // System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        } else {
            n = len1 / 3;
            newlen1 = len1 - n;
            arr[k] = word1.substring(0, n);
            arr[k + 1] = word1.substring(n, newlen1);
            arr[k + 2] = word1.substring(newlen1, len1);
            k = 3;
            // System.out.println(arr[k] + " " + arr[k + 1] + " " + arr[k + 2]);
        }
        if (len2 % 3 == 0) {
            n = len2 / 3;
            newlen2 = len2 - n;
            arr[k] = word2.substring(0, n);
            arr[k + 1] = word2.substring(n, newlen2);
            arr[k + 2] = word2.substring(newlen2, len2);
            // System.out.println(arr[k] + " " + arr[k + 1] + " " + arr[k + 2]);
        }

        else {
            n = len2 / 3;
            newlen2 = len2 - n;
            arr[k] = word2.substring(0, n);
            arr[k + 1] = word2.substring(n, newlen2);
            arr[k + 2] = word2.substring(newlen2, len2);
            // System.out.println(arr[k] + " " + arr[k + 1] + " " + arr[k + 2]);
        }
        System.out.println(arr[3] + arr[0] + arr[2] + arr[5]);

        // for (i = 0; i < n; i++){
        // System.out.println(arr[i]);
        // }
    }
}
