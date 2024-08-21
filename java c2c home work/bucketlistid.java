import java.util.Scanner;

public class bucketlistid {

    public static int findBucket(int itemId) {
        int maxDigit = 0;

        // Iterate through each digit of the item ID
        while (itemId > 0) {
            int digit = itemId % 10; // Extract the last digit
            maxDigit = Math.max(maxDigit, digit); // Update maxDigit if the current digit is greater
            itemId /= 10; // Remove the last digit
        }

        return maxDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the item ID from the user
        System.out.print("Enter the item ID: ");
        int itemId = scanner.nextInt();

        // Find the bucket based on the maximum digit value
        int bucket = findBucket(itemId);

        // Output the result
        System.out.println("Bucket: " + bucket);
    }
}
