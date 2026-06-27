package RecursionBasic;

import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci {
      public static ArrayList<Integer> fibonacciFirst(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(n, ans);
        return ans;
    }

    
    private static void helper(int n, ArrayList<Integer> ans) {

        // base case
        if (n == 0) {
            return;
        }

        // build first n-1 elements first
        helper(n - 1, ans);

        // now decide what to add
        if (ans.size() == 0) {
            ans.add(0);
        } 
        else if (ans.size() == 1) {
            ans.add(1);
        } 
        else {
            int next = ans.get(ans.size() - 1) + ans.get(ans.size() - 2);
            ans.add(next);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this to generate more or fewer Fibonacci numbers
        ArrayList<Integer> fibonacciNumbers = fibonacciFirst(n);

        Collections.reverse(fibonacciNumbers); // Reverse the list to get the first n Fibonacci numbers in order
        System.out.println("First " + n + " Fibonacci numbers: " + fibonacciNumbers);
    }
}
