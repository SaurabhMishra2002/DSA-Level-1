package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllPairings {

    public static void backtrack(int [] nums, boolean[] used, List<int[]> current){
        // Write the logic to generate all pairings of the given numbers using recursion and backtracking

        //Step 1: Check if all numbers are used
        // If all numbers are used, print the current pairing and return
        //Step 2: Iterate through the numbers and find the first unused number
        //Step 3: Mark the number as used and find the next unused number to form
        // a pair with the first number
        //Step 4: Add the pair to the current list and recursively call backtrack
        
    }

    static void Printcurrent(List<int[]> current){
        for(int[] pair : current){
            System.out.print("[" + pair[0] + ", " + pair[1] + "] ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9};

        boolean[] used = new boolean[nums.length];
        List<int[]> current = new ArrayList<>();

        backtrack(nums, used, current);
    }
}
