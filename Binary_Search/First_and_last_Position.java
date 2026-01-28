package Binary_Search;

public class First_and_last_Position {
    public static void main(String[] args) {
        int[] arr = {10,10,10,10,20,20,20,20,30,30,30,30,40,40,40,40};
        int target = 30;

        int n = arr.length;
        int low;
        int high;

        //first position
        int fp = -1;
        low= 0;
        high = n -1;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(arr[mid] == target){
                if(mid > 0 && arr[mid] == arr[mid -1]){
                    high = mid -1;
                }else {
                    fp = mid;
                    break;
                }
            }else if(arr[mid] > target){
                high = mid -1;
            }else {
                low = mid + 1;
            }
        }


        // Last Position
        int lp = -1;
        low = 0;
        high = n -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                if((mid+1)<n && arr[mid] == arr[mid+1]){
                    low = mid +1;
                }else {
                    lp = mid;
                    break;
                }
            } else if (arr[mid] > target) {
                high = mid -1;
            }else {
                low = mid +1;
            }
        }

        System.out.println(fp);
        System.out.println(lp);
    }
}
