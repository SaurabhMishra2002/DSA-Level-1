package DP;

public class MinCostPath {
    //Using Tabulation or Bottom up approach
    public static int minCostTabulation(int [][]matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        int [][]dp = new int[m][n];

        dp[0][0] = matrix[0][0];

        for(int j = 1; j < n; j++){
            dp[0][j] = dp[0][j-1] + matrix[0][j];
        }
        

        for(int i = 1; i < n; i++){
            dp[i][0] = dp[i-1][0] + matrix[i][0];
        }

        //(i+1,j) = down
        //(i,j+1) = right
        //(i+1,j+1) = diagonal

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
            }
        }
        return dp[m-1][n-1];
    }

    // This is basic Recursion solution, we can optimize it using DP
    // Time Complexity: O(3^(m*n)) where m is number of rows and n is number of columns

    // using memoization or dynamic programming, we can reduce the time complexity to O(m*n)
    // we can also reduce the space complexity to O(n) by using only two rows of the dp array at a time

    public static int minCost(int [][]matrix, int x, int y,int [][]dp){
        int m = matrix.length;
        int n = matrix[0].length;

        if(x >= m || y >= n){
            return Integer.MAX_VALUE;
        }

        if(x == m-1 && y == n-1){
            return matrix[x][y];
        }

        if(dp[x][y] != 0){
            return dp[x][y];
        }

        int right = minCost(matrix,x,y+1,dp);
        int down = minCost(matrix,x+1,y,dp);
        int diagonal = minCost(matrix,x+1,y+1,dp);


        int best = Math.min(right, Math.min(down, diagonal));
        
        return dp[x][y] = matrix[x][y] + best;
    }
    public static void main(String[] args) {
        int[][] cost = {
            {1, 2, 3},
            {4, 8, 2},
            {1, 5, 3}
        };

        // optimized using memoization or dynamic programming, but here we are using basic recursion

        int [][]dp = new int [cost.length][cost[0].length];
        System.out.println(minCost(cost,0,0, dp));

        System.out.println(minCostTabulation(cost));
    }
}
