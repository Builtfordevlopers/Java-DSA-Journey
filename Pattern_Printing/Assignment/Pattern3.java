/*

      1
    1 2 3
  1 2 3 4 5
1 2 3 4 5 6 7

      A
    A B C
  A B C D E
A B C D E F G

      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4

      A
    B A B
  C B A B C
D C B A B C D

1 2 3 4 4 3 2 1
1 2 3     3 2 1
1 2         2 1
1             1

1 2 3 4 5 6 7 8
1 2 3     4 5 6
1 2         3 4
1             2

A B C D E F G H
A B C     F G H
A B         G H
A             H

*/


package Pattern_Printing.Assignment;

public class Pattern3 {
    public static void main(String[] args) {
        int n= 4;
// Question 11

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" " +" ");

            }
            int nst = 1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(nst + " ");
                nst++;
            }
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(nst + " ");
                nst++;
            }

            System.out.println();
        }

        System.out.println();
//Question 12

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" " +" ");

            }
            int nst = 1;
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(nst + 64) + " ");
                nst++;
            }
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print((char)(nst + 64) + " ");
                nst++;
            }
            System.out.println();
        }

        System.out.println();
        
// Question 13

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
// Question 14

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print((char)(j+64) + " ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }

        System.out.println();
//Question 15


        for(int i = 1; i <= n; i++) {

            int limit = n - i + 1;

            // Left side: 1 to limit
            for(int j = 1; j <=  n-i+1; j++) {
                System.out.print(j + " ");
            }

          // Middle spaces: (i-1)*2 spaces
            for(int s = 1; s <= (i-1)*2; s++) {
                System.out.print(" " + " ");
            }

          // Right side: limit to 1
            for(int j =  n-i+1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();
// Question 16

        for (int i = 1; i <=n ; i++) {
            int a = 1;
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(a +" ");
                a++;
            }
            for (int j = 1; j <=(i-1)*2 ; j++) {
                System.out.print(" " + " ");

            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <=n ; i++) {
            int a = 1;
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print((char)(a+64) +" ");
                a++;
            }
            for (int j = 1; j <=(i-1)*2 ; j++) {
                System.out.print(" " + " ");
                a++;
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print((char)(a+64) + " ");
                a++;
            }
            System.out.println();
        }

    }
}
