package Pattern_Printing;

public class Trinagles {
    public static void main(String[] args) {
        int n = 6;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i<=n-1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
