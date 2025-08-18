
package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumToCloset {

    //[-1,2,1,-4]  Target = 1

    public static int threeSumClosest(int [] nums, int target){
        Arrays.sort(nums);
        //Brut Force approach
        // int closetSum = 0;
        // int minDiff = Integer.MAX_VALUE;

        // for(int i =0; i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         for(int k = j+1;k<nums.length;k++){
        //             int currentSum = nums[i]+nums[j]+nums[k];
        //             int diff = Math.abs(currentSum - target);

        //             if(diff < minDiff){
        //                 minDiff = diff;
        //                 closetSum = currentSum;
        //             }

        //             if(diff == 0){
        //                 return currentSum;
        //             }
        //         }
        //     }
        // }
        // return closetSum;

        //Optimized approach
        int closetSum = 0;  
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i<nums.length-2;i++){
            int left  = i+1;
            int right = nums.length-1;

            while(left < right){
                int currentSum = nums[i] +nums[left] +nums[right];
                int diff = Math.abs(currentSum - target);

                if(diff <minDiff){
                    minDiff = diff;
                    closetSum = currentSum;
                }

                if(currentSum <target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closetSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(threeSumClosest(nums, target)); 

        sc.close();
    }

}
