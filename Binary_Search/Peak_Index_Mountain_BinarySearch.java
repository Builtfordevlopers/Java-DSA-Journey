package Binary_Search;

public class Peak_Index_Mountain_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,60,50,40};
        int n = arr.length;
        int peakIndex = -1;
        int peakElement = -1;
        int low =1;
        int high = n-2;

        while(low <= high){
            int mid = low + (high -low) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                peakIndex = mid;
                peakElement = arr[mid];
                break;
            } else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                low = mid+1;
            }else {
                high = mid -1;
            }
        }
        System.out.println(peakIndex);
        System.out.println(peakElement);
    }
}
