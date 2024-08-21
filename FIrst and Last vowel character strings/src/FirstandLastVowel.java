import java.util.Scanner;

class FirstandLastVowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of array:");
        int n = sc.nextInt();
        String arr[] = new String[n];
        StringBuilder con = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().toLowerCase();

            int length = arr[i].length();
            if (length > 0 && isVowel(arr[i].charAt(length - 1)) && isVowel(arr[i].charAt(0)))
                con.append(arr[i]);
        }
        if (con.length() == 0) {
            System.out.println("match not found");
        } else {
            System.out.println(con);
        }

    }

    public static boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
