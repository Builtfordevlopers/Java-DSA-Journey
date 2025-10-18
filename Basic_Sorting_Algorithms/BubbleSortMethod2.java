package Basic_Sorting_Algorithms;
// STILL it is kind of worst case.
public class BubbleSortMethod2 {
    public static void print(int arr[]){
        for (int ele : arr){
            System.out.print(ele    + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2574,522,224,24,25,41,45,12,54};
        int n = arr.length;
        print(arr);

        for (int x = 0; x < n-1; x++) {
            for (int i = 0; i <n-1-x; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
