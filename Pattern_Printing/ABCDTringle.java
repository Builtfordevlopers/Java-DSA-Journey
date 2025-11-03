package Pattern_Printing;

public class ABCDTringle {
    public static void main(String[] args) {
        int n = 6;

        // Coll printing ander walla loop
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }

        System.out.println();
        // Row printing
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }

        System.out.println();
        // Coll printing ander walla loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }

        System.out.println();
        // Row printing
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print((char)(i+96) + " ");
            }
            System.out.println();
        }
    }
}
