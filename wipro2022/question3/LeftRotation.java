/*
 * Question : 3 – Left Rotation
Problem Statement

A left rotation operation on an array shifts each of the array’s elements unit to the left. For example, if 2 left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].

Given an array of integers and a number, , perform left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

Function Description

Complete the function rotLeft in the editor below. It should return the resulting array of integers.

rotLeft has the following parameter(s):

An array of integers .
An integer , the number of rotations.
Input Format

The first line contains two space-separated integers and , the size of and the number of left rotations you must perform.

The second line contains space-separated integers a[i].

Constraints

1 <= n <= 10^5
1 <= d <= n
1 <= a[i] <= 10^8
Output Format

Print a single line of space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input
5 4
1 2 3 4 5

Sample Output
5 1 2 3 4

Explanation
When we perform d=4 left rotations, the array undergoes the following sequence of changes:

[1,2,3,4,5] → [2,3,4,5,1] → [3,4,5,1,2] → [4,5,1,2,3] → [5,1,2,3,4]

Test Case : 1

Input (stdin)

5 4
1 2 3 4 5
Expected Output

5 1 2 3 4
Test Case : 2
Input (stdin)

20 10
41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51
Expected Output

77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77
C
 */

package wipro2022.question3;

import java.util.Scanner;

class LeftRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        System.out.println("Enter No of Times Left Rotate:");
        int rotate = sc.nextInt();
        int arr[] = new int[n];
        int i, j, k;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (j = 0; j < rotate; j++) {
            int first = arr[0];
            for (k = 0; k < n - 1; k++) {
                arr[k] = arr[k + 1];
            }
            arr[k] = first;
        }

        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
