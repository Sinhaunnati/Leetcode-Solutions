class Solution {
    private boolean possible(int[] arr,int day,int m,int k){
        int count=0;
        int bouq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day) count++;
            else{
                bouq+=(count/k);
                count=0;
            }

        }
        bouq+=(count/k);
        return bouq >= m;
       
    }
    public int minDays(int[] bloomDay, int m, int k) {
         int n = bloomDay.length;

        if ((long) m * k > n) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
            }
        
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(possible(bloomDay,mid,m,k))  high=mid-1;
            else low=mid+1;
        }
        return low;

        
    }
    }
