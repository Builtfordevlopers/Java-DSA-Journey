package Array_and_ArrayLists;

public class MaximumELement {
    public static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i =0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {6,8,14,2,23,47,4,3,10};

        System.out.println(max(arr));
        System.out.println(minimum(arr));
    }
}
