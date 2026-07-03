class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Stack<Integer> st=new Stack<>();
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int idx=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    idx=j;
                    break;
                    
                }

            }
            int res=-1;
            for(int k=idx+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    res=nums2[k];
                    break;
                }
            }
            ans[i]=res;
        }
        return ans;
        
    }
}