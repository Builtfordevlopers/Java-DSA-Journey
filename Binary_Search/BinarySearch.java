package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,10};

        int target = 40;
        int n = arr.length;
        int low = 0;
        int high = n-1;

        boolean found = false;

        while(low <= high){
            int mid = (low + high) /2;

            if(arr[mid] == target){
                found = true;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid +1;
            }
        }

        if(found){
            System.out.printf("Found The element");
        }else {
            System.out.printf("Not Found");
        }
    }
}
