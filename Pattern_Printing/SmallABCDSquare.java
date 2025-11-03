package Pattern_Printing;

public class SmallABCDSquare {
    public static void main(String[] args) {
        int n =4;
        //coulam printing
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }
        System.out.println();
        //row printing
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(i+96) + " ");
            }
            System.out.println();
        }
    }
}
