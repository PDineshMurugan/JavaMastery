
/**
 * UserIdGeneration
 * First Name = Rajiv
 * Last Name =Roy
 * PIN = 560037
 * N= 6
 * Step1 - Length of Last_Name is less than the Length of First_Name, so the
 * Smaler Name is “Roy”
 * and the Longer Name is “Rajiv”
 * Step2 - The user id will be = Last Letter of the smaller name +Entre word in
 * the longer name +
 * Digit at position N in the PIN when traversing the PIN from left to right
 * +Digit at position N in the
 * PIN when traversing the PIN from right to left
 * =Last Letter of “Roy”+ Entre word in Rajiv+ 6th Digit of Pin from left + 6th
 * Digit of PIN from
 * right
 * =y+ Rajiv+7+5 (Therefore, user-id=yRajiv75)
 * Step3 -Toggle the alphabet in the user-id. So,user-id = YrAJIV75
 */
import java.util.*;

public class UserIdGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String first = sc.next();
        int size1 = first.length();
        System.out.println("Second Name:");
        String second = sc.next();
        int size2 = second.length();
        System.out.println("Enter PIN:");
        int pin = sc.nextInt();
        System.out.println("Enter N:");
        int n = sc.nextInt();
        int pincopy = pin;
        char first1 = second.toUpperCase().charAt(size2 - 1);
        char second2 = first.toLowerCase().charAt(0);
        String third3 = first.toUpperCase().substring(1, size1);
        int count = 0, temp = 0, revpin = 0;
        while (pin != 0) {
            count++;
            temp = pin % 10;
            revpin = revpin * 10 + temp;
            pin = pin / 10;
        }

        int sixth = 0, revsixth = 0, i = 0;

        if (count <= n) {
            System.out.println("the N is greater than count of the digit");
        } else {

            for (i = 0; i < n; i++) {
                sixth = pincopy % 10;
                pincopy /= 10;
            }
            for (i = 0; i < n; i++) {
                revsixth = revpin % 10;
                revpin /= 10;
            }
        }
        System.out.print(first1);
        System.out.print(second2);
        System.out.print(third3);
        System.out.print(revsixth);
        System.out.print(sixth);

    }
}