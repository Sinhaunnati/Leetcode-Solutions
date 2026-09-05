class Solution {
    int[] dp;

    public int climbStairs(int n) {
        dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return func(n);
    }

    int func(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;

        if (dp[n] != -1) {
            return dp[n];
        }

        int left = func(n - 1);
        int right = func(n - 2);

        dp[n] = left + right;

        return dp[n];
    }
}