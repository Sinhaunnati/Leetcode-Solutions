class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer> mpp=new HashMap<>();

      for(int i:arr){
        mpp.put(i,mpp.getOrDefault(i,0)+1);
      }
      int ans = -1;
      for(int i:mpp.keySet()) if(mpp.get(i)==i) ans=Math.max(ans,i);

      return ans;
        
    }
}