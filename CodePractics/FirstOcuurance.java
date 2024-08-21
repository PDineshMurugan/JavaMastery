package CodePractics;

import java.util.Scanner;

public class FirstOcuurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int n = str1.length();
        int m = str2.length();

        for (int i = 0; i < n; i = i + 3) {

            for (int j = 0; j < m; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {

                    if (i + m - 1 < n) {
                        if (str1.substring(i, i + m).equals(str2.substring(0))) {
                            System.out.println(i);
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }

}
