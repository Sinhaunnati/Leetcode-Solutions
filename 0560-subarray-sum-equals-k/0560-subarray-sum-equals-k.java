import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

       
        mpp.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int remain = prefixSum - k;

            if (mpp.containsKey(remain)) {
                count += mpp.get(remain);
            }

          
            mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}