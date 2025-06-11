package Leetcode;

class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {1, 4, 5}
        };
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int j = 1; j<=n-1; j++){
            grid[0][j] += grid[0][j-1];
        }
        for(int i = 1; i<=m-1; i++){
            grid[i][0] += grid[i-1][0];
        }
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }

}
