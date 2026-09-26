class Solution {

    int findDays(int[] weights,int cap){
        int days=1;
        int load=0;

        for(int i=0;i<weights.length;i++){
            if(weights[i]+load>cap){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;

        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int numberOfDays=findDays(weights,mid);
            if(numberOfDays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
}