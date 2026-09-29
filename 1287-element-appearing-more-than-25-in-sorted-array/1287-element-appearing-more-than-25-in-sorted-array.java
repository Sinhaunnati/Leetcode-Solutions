class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> mpp=new HashMap<>();

        for(int num:arr){
            mpp.put(num,mpp.getOrDefault(num,0)+1);

        }
        for(int num:mpp.keySet()){
            if(mpp.get(num)>arr.length/4) return num;
            
        }
        return -1;
        
    }
}