package Array_and_ArrayLists;
import java.util.Arrays;

public class SortArray {
    public static void print(int[] arr){
        for (int i =0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,22,5,1,55,25,5,9,663,8,58,6,8,5,2,5,52,41,5,52};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
}
