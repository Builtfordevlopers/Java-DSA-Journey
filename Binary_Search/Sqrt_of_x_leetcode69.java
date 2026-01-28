package Binary_Search;

import java.util.Scanner;

public class Sqrt_of_x_leetcode69 {
    public static int mySqrt(int x) {
        long low = 0;
        long high = (long) x;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) high;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int result = mySqrt(x);

        System.out.println("Square root (floor) = " + result);
    }
}


