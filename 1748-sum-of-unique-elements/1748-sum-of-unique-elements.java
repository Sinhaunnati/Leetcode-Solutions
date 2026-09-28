class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(int num:mpp.keySet()){
        if(mpp.get(num)==1){
            sum+=num;

        }}
        return sum;
        
    }
}