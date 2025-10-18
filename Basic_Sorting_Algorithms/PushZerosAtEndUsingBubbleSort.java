package Basic_Sorting_Algorithms;

public class PushZerosAtEndUsingBubbleSort {
    public static void print(int arr[]){
        for (int ele: arr){
            System.out.print(ele    + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 52, 1, 0, 152, 45, 0, 415, 0, 54, 410, 0};
        int n = arr.length;

        print(arr);
        int noz = 0;
        for (int i = 0; i <n; i++) {
            if(arr[i] == 0){
                noz++;
            }
        }
        for (int x =0; x<noz; x++){ // noz pass

            for (int i = 0; i <n-1-x; i++) {
                if(arr[i] == 0){
                    int temp = arr[i];
                    arr[i] = arr[i +1];
                    arr[i+1] = temp;
                }
            }
        }

        print(arr);

    }
}
