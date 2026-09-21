class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int right=0;
        int sum=0;
        int count=0;
        
        while(right<arr.length){
            sum+=arr[right];
          
            if(right>=k){
                sum-=arr[left];
                left++;
                }

                if(right>=k-1){
                    int avg=sum/k;
            
            if(avg>=threshold){
                count++;

            }
            }
            right++;
        }
        return count;

        
    }
}