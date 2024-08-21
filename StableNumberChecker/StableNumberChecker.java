
//occurance of the numbers of the digit must be equal
//StableNumberChecker 
import java.util.Scanner;

public class StableNumberChecker {

    public static boolean isStable(int number) {

        int[] digitCount = new int[11];
        int tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            digitCount[digit]++;
            tempNumber /= 10;
        }
        int firstcount = 0;
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > 0) {
                firstcount = digitCount[i];
                break;
            }
        }
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > 0) {
                if (firstcount != digitCount[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(isStable(input));
    }
}
