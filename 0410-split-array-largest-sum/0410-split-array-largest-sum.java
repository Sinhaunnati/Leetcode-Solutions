class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = 0, hi = 0;
        for (int n : nums) {
            lo = Math.max(lo, n);
            hi += n;
        }

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (canSplit(nums, k, mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private boolean canSplit(int[] nums, int k, int limit) {
        int parts = 1, sum = 0;
        for (int n : nums) {
            if (sum + n > limit) {
                parts++;
                sum = n;
            } else {
                sum += n;
            }
        }
        return parts <= k;
    }
}