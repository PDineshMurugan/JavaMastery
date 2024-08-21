package ReverseTheSenstence;

/*
 * 6. Write a Java program to Reverse words in a given string keeping the words in original form.
Ex: Iuput - i.am.attending.aspire.interview
       Output - interview.aspire.attending.am.i

 */
import java.util.Scanner;

public class ReverseTheSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        String arr[] = new String[n - 1];
        String ans = "";
        int i = n - 1, m = 0, j = n;
        for (; i >= 0; i--) {
            if (str.charAt(i) == '.') {
                arr[m] = str.substring(i + 1, j);
                arr[++m] = ".";
                m++;
                j = i;
            } else if (i == 0) {

                arr[m] = str.substring(0, j);
            }
        }
        for (i = 0; i <= m; i++) {
            ans = ans + arr[i];

        }
        System.out.print(ans);
    }
}
