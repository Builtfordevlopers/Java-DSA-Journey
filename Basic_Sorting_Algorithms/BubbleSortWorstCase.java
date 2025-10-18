package Basic_Sorting_Algorithms;

public class BubbleSortWorstCase {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10,4,1,0,-2};
        int n = arr.length;
        for (int x = 1; x <=n-1; x++) {

            for (int j = 0; j <n-1; j++) {
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        print(arr);
    }
}
