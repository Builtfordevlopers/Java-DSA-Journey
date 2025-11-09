/*

Question : -

* * * * * *
* *
* *
* * * * * *

* * * *
* * * *
* * * *
* * * *

1
1 2
1 2 3
1 2 3 4

A
A B
A B C
A B C D

1
2 1
3 2 1
4 3 2 1

*/

package Pattern_Printing.Assignment;

public class Patten2 {
    public static void main(String[] args) {
        int n = 4;

// Question No 6
        for (int i = 1; i <=n; i++) {
            if(i ==1 || i == n){
                for (int j = 1; j <=n+2; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }else {
                for (int j = 1; j <=n-2; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }

        }
        System.out.println();
// Question no 7

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
        System.out.println();
//Question No 8

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
// Question No 9
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();
//Question No 10

        for (int i = 1; i <=n ; i++) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(j +" ");
            }
            System.out.println();

        }
    }
}
