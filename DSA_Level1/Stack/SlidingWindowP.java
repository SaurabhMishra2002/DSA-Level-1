package Stack;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowP {

     public static int [] maxSlidingWindow(int[] nums, int k) {
        //Step1. Find the next greater element for each element in the array
        int nge[] = new int[nums.length];
           Stack<Integer> st = new Stack<>();

           nge[nums.length-1] = nums.length;
           st.push(nums.length-1);

           for(int i=nums.length-1;i>=0;i--){
            while(st.size() >0 && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            nge[i] = st.size() ==0 ? nums.length: st.peek();
            st.push(i);
             
           }

        // // Step 2: Use NGE to find max in each sliding window

        // Check for edge cases
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        int j=0;
        int []result = new int [nums.length-k+1];

        for(int i=0;i<nums.length-k;i++){
            if(j<i) {
                j = i;
            }

            while(nge[j] <i+k){
                j = nge[j];
            }
            result[i] = nums[j];
        }

        return result;
    }

    

        public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] output = maxSlidingWindow(nums, k);
        System.out.println("Output: " + Arrays.toString(output));
        }
}
