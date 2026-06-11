// class Solution {
//     public int findPeakElement(int[] nums) {
//         if (nums.length == 1 || nums[0] > nums[1]) return 0;
//         if (nums[nums.length-1] > nums[nums.length-2]) return nums.length - 1;
//         for(int i=1;i<nums.length-1;i++){
//             if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
//                 return i;
//             }
//         }
//         return -1;
        
//     }
// }



class Solution {
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] < nums[mid + 1]) {
                lo = mid + 1;  
            } else {
                hi = mid;      
            }
        }

        return lo; 
    }
}