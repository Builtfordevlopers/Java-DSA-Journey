/*

composite mixture of 3 pattern

- - -
- -
-
.
    +

1
1 2
1 2 3
1 2 3 4

     +
.                  j = i-1; j >=1 ; j--   To achieve this  the main logic is                     Hold
1                  to hold (row)ith value Minus with 1 and assign into j and then print it
2 1
3 2 1




Expected Output

      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1




*/

package Pattern_Printing.StanderdParrten;

public class NumberPiramidPalindrom {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <=n ; i++) {
           for (int j = 1; j <=n-i ; j++) {
              System.out.print(" " + " ");
           }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            for (int j = i-1; j >=1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
