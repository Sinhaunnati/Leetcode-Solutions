class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        
        map.put(0, -1);

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

          
            if (nums[i] == 0) {
                prefixSum--;
            } else {
                prefixSum++;
            }

            if (map.containsKey(prefixSum)) {

                int length = i - map.get(prefixSum);
                maxLen = Math.max(maxLen, length);

            } else {
                
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}