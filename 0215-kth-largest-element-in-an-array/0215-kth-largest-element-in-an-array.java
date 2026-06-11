class Solution {
    public int findKthLargest(int[] nums, int k) {
        TreeMap<Integer,Integer> mpp=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);

        }
    int count = 0;
    for (Map.Entry<Integer, Integer> entry : mpp.descendingMap().entrySet()) {
        count += entry.getValue();      
        if (count >= k) return entry.getKey();
    }

    return -1;
}

    }
