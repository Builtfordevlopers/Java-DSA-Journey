/*
Floyd's Triangle

Expected Output
1
2 3
4 5 6
7 8 9 10

*/


package Pattern_Printing.Special_Pattern;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 4;
        int a = 1;

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

    }
}
