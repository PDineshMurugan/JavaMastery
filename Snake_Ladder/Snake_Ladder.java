package Snake_Ladder;

import java.util.Scanner;

import java.util.Random;

public class Snake_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int board[] = new int[101];
        constant(board);
        Random rand = new Random();
        int player1 = 0;
        int player2 = 0;
        int win = 100;
        //
        System.out.println("Player 1 Enter your name:");
        String p1 = sc.nextLine();
        System.out.println("Player 2 Enter your name");
        String p2 = sc.nextLine();
        while (player1 < win && player2 < win) {
            // player one
            System.out.println(p1 + "\n Roll the dics by using enter ");
            sc.nextLine();
            int move = rand.nextInt(6) + 1;
            System.out.println("The Disc roll:" + move);
            player1 = movement(move, player1, board);
            System.out.println("Position of " + p1 + " :" + player1);
            if (player1 == 100) {
                break;
            }
            System.out.println("___________________________________________");
            // player two:
            System.out.println(p2 + "\n Roll the dics by using enter ");
            sc.nextLine();
            move = rand.nextInt(6) + 1;
            System.out.println("The Disc roll:" + move);
            player2 = movement(move, player2, board);
            System.out.println("Position of " + p2 + " :" + player2);
            if (player2 == 100) {
                break;
            }
            System.out.println("___________________________________________");

        }

        if (player1 > player2) {
            System.out.println(
                    "*******************************\n" +
                            "*                             *\n" +
                            "*     winner is " + p1 + "   *\n" +
                            "*                             *\n" +
                            "*******************************\n");
        } else {
            System.out.println(
                    "*******************************\n" +
                            "*                             *\n" +
                            "*     winner is " + p2 + "   *\n" +
                            "*                             *\n" +
                            "*******************************\n");
        }
        sc.close();
    }

    public static int movement(int move, int player, int board[]) {
        if (player + move < 101) {
            player += move;
        }
        if (board[player] != 0) {
            return board[player];
        }
        return player;
    }

    public static void constant(int board[]) {
        // Ladder
        board[2] = 38;
        board[7] = 14;
        board[8] = 31;
        board[15] = 26;
        board[21] = 42;
        board[28] = 84;
        board[36] = 44;
        board[51] = 67;
        board[71] = 91;
        board[78] = 98;
        board[87] = 94;

        // Snakes
        board[16] = 6;
        board[46] = 25;
        board[49] = 11;
        board[62] = 19;
        board[64] = 60;
        board[74] = 53;
        board[89] = 68;
        board[92] = 88;
        board[95] = 75;
        board[99] = 80;

    }
}
