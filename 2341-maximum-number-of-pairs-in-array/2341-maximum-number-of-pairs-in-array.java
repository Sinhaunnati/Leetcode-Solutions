class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int pairs = 0;

        for(int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        int leftover = 0;

        for(int count : mpp.values()) {
            pairs += count / 2;
            leftover += count % 2;
        }

        return new int[]{pairs, leftover};
    }
}