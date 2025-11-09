/*
Espected Output

5 Question

1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4

1 2 3 4
1 2 3
1 2
1

A
A B
A B C
A B C D

1
A B
1 2 3
A B C D
1 2 3 4 5

*
* *
* * *
* * * *
* * *
* *
*

*/

package Pattern_Printing.Assignment;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
//Question No 1

        for (int i = 1; i <=n ; i++) { //row
            for (int j = 1; j <=n ; j++) { //col
                System.out.print(i +" ");
            }
            System.out.println();
        }
        System.out.println();
//Question No 2

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
//Question No 3

        for (int i = 1; i <=n ; i++) { //row
            for (int j = 1; j <=i ; j++) { //col
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
        System.out.println();
//Question No 4

        for (int i = 1; i <=n+1 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2==1){
                    System.out.print(Math.min(i,j) + " ");
                }else {
                    System.out.print((char)(Math.min(i,j)+64) + " ");
                }

            }
            System.out.println();
        }
        System.out.println();
//Question No 5
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }

    }
}
