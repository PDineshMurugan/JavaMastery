// Question 2:

// Sophia and Liam are playing a word game. Sophia has given Liam two strings A and B of lowercase alphabetic characters. Liam has to derive a string C from A by removing characters from string A such that string C does not contain any characters of string B. Liam needs your help to accomplish this task. Write a program to assist Liam in generating string C.

// Given strings A and B as input, provide string C as output.

// String A: "programming"

// String B: "python"

// String C:

// "rgrammig"

// Explanation:

// Remove characters 'p', 'y', 't', 'h', 'o', 'n' from string A to get string C. Thus, string C is "grmmig".

// Your code should read input in the following format

// programming,python

// When the above line in given as input, the input is split by comma and first string will be string A and second one will be string B. For the above line, A = "programming", B = "python"
// The output should be string C as in the line below

// grmmig

// Your code will be evaluated against 10 testcases and you will be awarded 1 mark each for each of the passed test case

// Test Case: 1

// Input

// computer,cat

// Output

// ompuer

// Test Case: 2

// Input

// occurrence,car

// Output

// ouene

// Test Case: 3

// Input

// characters,chance

// Output

// rtrs

// Test Case: 4

// Input

// spleen,split

// Output

// een

// Test Case: 5

// Input

// receiver,sender

// Output

// civ

// Test Case: 6

// Input

// null,sat

// Output

// null

// Test Case: 7

// Input

// matter,energy

// Output

// matt

// Test Case: 8

// Input

// count,word

// Output

// cunt

// Test Case: 9

// Input

// maximum,minimum

// Output

// ax

// Test Case: 10

// Input

// wrapper,paper

// Output

// w

package Task.TCS;

import java.util.Scanner;

public class DiffString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int n = str1.length();
        int m = str2.length();
        int j = 0, count = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            count = -1;
            for (j = 0; j < m; j++) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    count++;
                }
            }
            if (count == m - 1) {
                ans = ans + str1.charAt(i);

            }
        }
        System.out.println(ans);

    }

}
