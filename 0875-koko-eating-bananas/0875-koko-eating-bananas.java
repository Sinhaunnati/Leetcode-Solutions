class Solution {
    int findMax(int[] v) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < v.length; i++) {
            max = Math.max(max, v[i]);
        }
        return max;
    }

    int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        for (int i = 0; i < v.length; i++) {
            totalH += Math.ceil((double) v[i] / hourly);
        }
        return totalH;
    }

    int minEatingSpeed(int[] v, int h) {
        int low = 1;
        int high = findMax(v);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalH = calculateTotalHours(v, mid);

            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}