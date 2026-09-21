class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] merged=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                merged[k]=nums2[j];
                j++;
            }
            else{
                merged[k]=nums1[i];
                i++;
            }
            k++;
        }
         while (i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }
        int mid1=merged.length/2;
        int mid2=(merged.length/2)-1;
        if(merged.length%2==0){
            return ((merged[mid1]+merged[mid2])/2.0);



        }
        else{

            return merged[mid1];
        }

        
    }
}