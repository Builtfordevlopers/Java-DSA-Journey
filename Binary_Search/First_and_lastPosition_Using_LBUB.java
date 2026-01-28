package Binary_Search;

public class First_and_lastPosition_Using_LBUB {
    public static void main(){
        int[] arr = {10,10,10,10,20,20,20,20,30,30,30,30,40,40,40,40};
        int target = 30;
        int firstPosition;
        int lastPosition;

        //Simple Binary Search to Check weather target exist or not in the array.
        int n = arr.length;
        int low = 0;
        int high = n -1;
        boolean found =false;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                found = true;
                break;
            } else if (arr[mid] > target) {
                high = mid -1;
            }else {
                low = mid +1;
            }
        }

        if(found == false){
            System.out.println("Not Found");
        }else {

            //First Position
            n = arr.length;
            low = 0;
            high = n - 1;
            int lb = n;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] >= target) {
                    lb = Math.min(lb, mid);
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            firstPosition = lb;
            System.out.println(firstPosition);

            //Last Positions
            low = 0;
            high = n - 1;
            int ub = n;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] > target) {
                    ub = Math.min(ub, mid);
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            lastPosition = ub - 1;
            System.out.println(lastPosition);
        }
    }
}
