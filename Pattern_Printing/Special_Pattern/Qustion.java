/*

print first n numbers of AP
1 3 5 9 7
Expected output
1
1 3
1 3 5
1 3 5 7
*/

package Pattern_Printing.Special_Pattern;

public class Qustion {
    public static void main(String[] args) {
        int n = 4;
        // using math
        for (int i = 1; i <=n; i++) { // row
            for (int j = 1; j <=i ; j++) { //col
                System.out.print((2*j-1) + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Using variable
        for (int i = 1; i <=n; i++) { // row
            int a = 1;
            for (int j = 1; j <=i ; j++) { //col
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
        System.out.println();


    }
}
