
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N Number:");
        int n = sc.nextInt();
        fact(n);
    }

    public static void fact(int n) {
        double sum = 0, fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            sum += i / fact;
        }
        System.out.println(sum);
    }
}