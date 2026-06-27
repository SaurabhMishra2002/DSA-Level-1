package Recursion;
import java.util.*;
public class PrintAllSubsequenceOfArray {

    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("All subsequences of the array:");
        printSubsequences(arr, new ArrayList<>(), 0);

        for(ArrayList<Integer> res: result){
            System.out.println(res);
        }
    }
    public static  void printSubsequences(int []arr, ArrayList<Integer> ans, int idx) {
        if(idx == arr.length){
            result.add(new ArrayList<>(ans));
            return;
        }

        ans.add(arr[idx]);
        printSubsequences(arr, ans, idx+1); // Include the current element

        ans.remove(ans.size()-1);

        printSubsequences(arr, ans, idx+1); // Skip the current element
    }
}
