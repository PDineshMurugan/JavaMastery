package CodePractics.Array;

import java.util.Scanner;

class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        System.out.println("The element located in index:" + sol.findPeakElement(arr));
        //
    }
}

class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            if (nums[0] > nums[1]) {
                return 0;
            } else {
                return 1;
            }
        } else if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        } else
            for (int i = 1; i < n - 1; i++) {

                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                    return i;
                }
            }
        return 0;
    }
}