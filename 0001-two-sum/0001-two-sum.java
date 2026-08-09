//   import java.util.*;
//   public class Solution {
//      public static int[] twoSum(int nums[],int target){
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     System.out.println(nums[i]+nums[j]);
//                     return new int[]{i,j};
                    
//                 }

//             }
            
//         }
//         return new int[]{};
//      }
//   }




import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(nums[i], i);
        }

        return new int[] {}; 
    }
}