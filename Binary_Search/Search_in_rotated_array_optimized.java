package Binary_Search;

import java.util.Scanner;

public class Search_in_rotated_array_optimized {
    static class Solution {

        public int search(int[] arr, int target) {
            int n = arr.length;
            int low = 0;
            int high = n - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid;

                } else if (arr[mid] <= arr[high]) { // Right side sorted
                    if (target > arr[mid] && target <= arr[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }

                } else { // Left side sorted
                    if (target >= arr[low] && target < arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
            return -1;
        }
    }

    // ---------- MAIN METHOD ----------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Solution sol = new Solution();
        int index = sol.search(arr, target);

        System.out.println("Target index: " + index);
    }
}
