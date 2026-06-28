package Array_and_ArrayLists;

public class ArrayProducts {
    public static int product(int[] arr){
        int product=1;
        for (int i = 0; i<arr.length; i++){
            product *= arr[i];
        }
        return product;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {-6,8,14,-2,23,47,7};

        System.out.println(sum(arr));
        System.out.println(product(arr));
    }
}
