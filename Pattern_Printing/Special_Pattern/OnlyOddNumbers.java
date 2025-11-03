package Pattern_Printing.Special_Pattern;

public class OnlyOddNumbers {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) { // row
            for (int j = 1; j <=n; j++) { // col
                System.out.print((2*j-1) + " ");
            }
            System.out.println();
        }
    }
}
