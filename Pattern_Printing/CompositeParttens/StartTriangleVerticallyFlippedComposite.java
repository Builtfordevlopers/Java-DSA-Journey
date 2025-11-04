/*

Composite means mixture of two pattern onto single pattern

# # #
# #
#

   +

      *
    * *
  * * *
* * * *

    =

# # # *
# # * *
# * * *
* * * *


1
1 2
1 2 3
1 2 3 4

  =

      1
    1 2
  1 2 3
1 2 3 4

*/



package Pattern_Printing.CompositeParttens;

public class StartTriangleVerticallyFlippedComposite {
    public static void main(String[] args){
        int n = 4;

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n-i; j++) {
                System.out.print("#" + " ");
            }

            for (int k = 1; k <=i ; k++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n-i; j++) {
                System.out.print(" " + " ");
            }

            for (int k = 1; k <=i ; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <=n ; i++) {
            //Uper se Triangle i dont how to say it
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" " + " ");
            }
            // Normal Triangle
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(j+64) + " ");
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }

    }
}
