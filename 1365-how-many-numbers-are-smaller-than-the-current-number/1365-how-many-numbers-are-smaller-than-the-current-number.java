
// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
                // int[] ans=new int[nums.length];

    //     for(int i=0;i<nums.length;i++){
    //         int count=0;
    //         for(int j=0;j<nums.length;j++){
    //              if (nums[j] < nums[i]) {
    //                 count++;
    //             }
    //         }

    //             ans[i]=count;

        
        
    // }
    //     return ans;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] copy = nums.clone();     
        Arrays.sort(copy);             

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < copy.length; i++) {
            if (!map.containsKey(copy[i])) {
                map.put(copy[i], i);
            }
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }
}

