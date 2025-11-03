/*
Expected output
0 0 * 0 0
0 0 * 0 0
0 0 * 0 0
0 0 * 0 0
0 0 * 0 0

0 0 0 0 0
0 0 0 0 0
* * * * *
0 0 0 0 0
0 0 0 0 0

0 0 0 0 0
0 0 0 0 0
0 0 * 0 0
0 0 0 0 0
0 0 0 0 0

    *
    *
* * * * *
    *
    *

The main point is that middil no of an odd no is (n/2+1)
midd = n/2+1
*/

package Pattern_Printing.Special2_Pattern;

public class Question {
    public static void main(String[] args) {
        int n = 5; // always odd

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(n/2+1 == j) {
                    System.out.print("*" + " ");
                }else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(n/2+1 == i) {
                    System.out.print("*" + " ");
                }else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(n/2+1 == i && n/2+1 == j) {
                    System.out.print("*" + " ");
                }else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(n/2+1 == i || n/2+1 == j) {
                    System.out.print("*" + " ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }
}
