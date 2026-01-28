package Binary_Search;

import java.util.Scanner;

public class Search_in_rotated_array {
    static class Solution {

        public int bs(int[] arr, int low, int high, int target) {
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }

        public int search(int[] arr, int target) {
            int n = arr.length;

            if (n <= 2) {
                for (int i = 0; i < n; i++) {
                    if (arr[i] == target) {
                        return i;
                    }
                }
                return -1;
            }

            int low = 1;
            int high = n - 2;
            int p = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    p = mid;
                    break;
                } else if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                    p = mid - 1;
                    break;
                } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                    if (arr[mid] > arr[n - 1]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }

            if (p == -1) {
                return bs(arr, 0, n - 1, target);
            }

            int left = bs(arr, 0, p, target);
            if (left != -1) return left;

            return bs(arr, p + 1, n - 1, target);
        }
    }

    // -------- MAIN METHOD ----------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted rotated array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Solution sol = new Solution();
        int index = sol.search(arr, target);

        System.out.println("Target found at index: " + index);
    }
}
