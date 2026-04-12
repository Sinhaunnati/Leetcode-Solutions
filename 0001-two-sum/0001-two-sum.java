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

    
// //   public static void main(String[] args){
// //     // Solution sol=new Solution();
// //         int nums[]={2,3,4,5};
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter target:");
// //         int target =sc.nextInt();
// //         // int[] result=sol.twoSum(nums,target);
// //          int[] result = twoSum(nums, target);
// //          if (result.length > 0) {
// //             System.out.println("Indices: " + result[0] + ", " + result[1]);
// //         } else {
// //             System.out.println("No pair found");
// //         }

// //         sc.close();
        
       
        
// //  }
// //      }


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