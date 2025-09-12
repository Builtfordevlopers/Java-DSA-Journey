/*
    Question:- LEETCODE 118
         Given an integer n generate pascal's triangle
                            1
                           1 1
                          1 2 1
                         1 3 3 1
                        1 4 6 4 1
                      1 5 10 10 5 1
*/

package Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Pascal_triangle {
    public static void main(String[] args) {

        // Method 1
        List<List<Integer>> ans = new ArrayList<>();
        int n =5;
        for (int i = 0; i <n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                l.add(1);
            }
            ans.add(l);
        }

        for (int i =2; i <n; i++) {
            for (int j =1;  j<=i-1; j++) {
                ans.get(i).set(j,ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
        }
        System.out.println(ans);
        //Method 2  (optimized)
//        class Solution {
//            public List<List<Integer>> generate(int n) {
//                List<List<Integer>> ans = new ArrayList<>();
//
//                for (int i = 0; i <n; i++) {
//                    List<Integer> l = new ArrayList<>();
//                    for (int j = 0; j <=i; j++) {
//                        if(j ==0 || j==i ){
//                            l.add(1);
//                        }else{
//                            l.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
//                        }
//                    }
//                    ans.add(l);
//                }
//                return ans;
//            }
//        }


    }
}
