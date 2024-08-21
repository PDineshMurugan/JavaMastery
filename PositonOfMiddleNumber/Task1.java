import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = input, count = 0, temp = 0;
        while (input != 0) {
            input /= 10;
            count++;
        }
        if (count % 2 == 0) {
            System.out.println("invalid number ender odd digit number");
        } else {
            int position = count / 2 + 1;
            for (int i = 0; i <= count / 2; i++) {
                temp = num % 10;
                num = num / 10;
            }
            if (count == 9) {
                System.out.println("Ten Crore");

            } else if (count == 7) {
                System.out.println("Ten Lakhs");

            } else if (count == 5) {
                System.out.println("Ten Thousand");

            } else if (count == 3) {
                System.out.println("hundred");
            } else if (count == 1) {
                System.out.println("one's");
            }
            System.err.println("Middle Number" + temp);
            System.out.println("Middle position" + position);
        }
    }
}
