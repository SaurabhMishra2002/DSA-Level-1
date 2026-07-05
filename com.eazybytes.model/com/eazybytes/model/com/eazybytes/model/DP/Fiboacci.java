package DP;
import java.util.Arrays;

public class Fiboacci {
    public static int nthFibonacci(int n, int []dp) {
        // if(n == 0){
        //     return 0;
        // }

        // if(n == 1){
        //     return 1;
        // }

        // if(dp[n] !=  -1){
        //     return dp[n];
        // }

        // return dp[n] = nthFibonacci(n - 1,dp) + nthFibonacci(n - 2,dp);


        //Bottom_up approach
        dp[0] = 0;
        dp[1] = 1;


        for(int i = 2; i <= n; i++){
            dp[i] += dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        int n = 5;

        int []dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int result = nthFibonacci(n,dp);
        System.out.println(result);
    }
}
