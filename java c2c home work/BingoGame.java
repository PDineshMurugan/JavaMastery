import java.util.Scanner;

public class BingoGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of cards
        int numCards = scanner.nextInt();

        // Read the values of the cards
        int[] cardValues = new int[numCards];
        for (int i = 0; i < numCards; i++) {
            cardValues[i] = scanner.nextInt();
        }

        // Initialize variables to track the maximum product and the corresponding card
        // values
        int maxProduct = Integer.MIN_VALUE;
        int card1 = 0, card2 = 0;

        // Iterate through all pairs of cards to find the maximum product
        for (int i = 0; i < numCards; i++) {
            for (int j = i + 1; j < numCards; j++) {
                int product = cardValues[i] * cardValues[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    card1 = cardValues[i];
                    card2 = cardValues[j];
                }
            }
        }

        // The winning amount is the sum of the values of the two cards with the maximum
        // product
        int winningAmount = card1 + card2;

        // Output the winning amount
        System.out.println(winningAmount);
    }
}
