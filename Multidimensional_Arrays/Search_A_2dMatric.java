/*
    Question:- LEETCODE 240
         Write an efficient algorithm That searches for a value target
         in an m * n integer matrix which has the following properties.

            --Integers im each row are sorted in ascending form left to right.
            --Integers in each column are sorted in ascending from top to bottom.


    NOT EFFICIENT CODE but works:-

    class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
        int m = arr.length; int n = arr[0].length;
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                if(arr[i][j]==x) return true;
            }
          }
          return false;
      }
    }
*/

package Multidimensional_Arrays;

public class Search_A_2dMatric {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,10,19},{3,6,9,16,22},{10,13,14,17,24},{1,821,23,26,30}};
        int m = arr.length; //row
        int n = arr[0].length; //col
        int target = 20;

        int i = 0, j = n-1;
        while(i<m && j>=0){
            if(arr[i][j] == target){
                System.out.println("yes we have the element");
                break;
            } else if (arr[i][j] > target) { // left shift
                j--;
            }else { // down shift
                i++;
            }
        }
        System.out.println("no you dont have this element");

    }
}
