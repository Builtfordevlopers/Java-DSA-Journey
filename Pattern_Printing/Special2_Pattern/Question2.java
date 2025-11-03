/*
Expected Output
*
  *
    *
      *
        *
          *
            *

            *
          *
        *
      *
    *
  *
*

*           *
  *       *
    *   *
      *
    *   *
  *       *
*           *

*/

package Pattern_Printing.Special2_Pattern;

public class Question2 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j<=i; j++){

                if( i == j) {

                    System.out.print("*" + " ");

                }else {

                    System.out.print(" " + " ");

                }
            }

            System.out.println();

        }

        System.out.println();


        for (int i = 1; i <=n; i++) {

            for (int j = 1; j<=n; j++){

                if(i + j == n+1){

                    System.out.print("*" + " ");

                }else {

                    System.out.print(" " + " ");
                }
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=n; j++) {

                if(i == j || i+j == n+1){

                    System.out.print("*" + " ");

                }else  {

                    System.out.print(" " + " ");

                }
            }

            System.out.println();
        }

    }
}