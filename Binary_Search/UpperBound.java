package Binary_Search;

public class UpperBound {
    public static void main(String[] args){
        int[] arr = {10,23,46,46,91,97,97,140,264};
        int target = 110;
        int n = arr.length;

        int low = 0;
        int high = n - 1;

        int up = n;

        while(low <= high){
            int mid = low + (high -low) / 2;
             if(arr[mid] > target){
                up = Math.min(up,mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println(up);
    }
}
