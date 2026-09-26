class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i:arr){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();

        for(int i:mpp.keySet()){
            if(set.contains(mpp.get(i))) return false;
            set.add(mpp.get(i));
        }
        return true;
        
    }
}