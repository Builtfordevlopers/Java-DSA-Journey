package Binary_Search;

public class Peak_Index_Mountain_LinearSearch {
    public  static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,60,50,40};
        int n = arr.length;
        int peakIndex = -1;
        int peakElement = -1 ;

        for (int i =1; i<=n-2; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                peakIndex = i;
                peakElement = arr[i];
            }
        }

        System.out.println(peakIndex);
        System.out.println(peakElement);
    }
}
