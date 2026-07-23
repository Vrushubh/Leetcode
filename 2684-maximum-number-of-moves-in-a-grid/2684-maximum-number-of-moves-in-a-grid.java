class Solution {

    int[][] dp;
    int[][] dir = {{-1, 1}, {0, 1}, {1, 1}};

    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = 0;

        for (int i = 0; i < m; i++) {
            ans = Math.max(ans, dfs(grid, i, 0));
        }

        return ans;
    }

    private int dfs(int[][] grid, int r, int c) {
        if (dp[r][c] != -1)
            return dp[r][c];

        int m = grid.length;
        int n = grid[0].length;

        int moves = 0;

        for (int[] d : dir) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr >= 0 && nr < m && nc < n &&
                grid[nr][nc] > grid[r][c]) {

                moves = Math.max(moves, 1 + dfs(grid, nr, nc));
            }
        }

        dp[r][c] = moves;
        return moves;
    }
}