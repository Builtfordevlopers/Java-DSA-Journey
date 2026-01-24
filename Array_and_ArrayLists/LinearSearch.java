package Array_and_ArrayLists;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int target = 111;

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.printf("Element found");
        }else {
            System.out.printf("Not Found");
        }
    }
}
