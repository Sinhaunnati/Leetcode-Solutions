class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int l=0;
        int r=0;
        int count=0;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        while(r<s.length()){
            int num=s.charAt(r)-'0';
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);

            while (mpp.getOrDefault(0, 0) > k && mpp.getOrDefault(1, 0) > k)  {
                int leftNum = s.charAt(l) - '0';
            mpp.put(leftNum, mpp.get(leftNum) - 1);
               if (mpp.get(leftNum) == 0) {
              mpp.remove(leftNum);
    }
    l++;

            }
            count=count+(r-l+1);
            r++;
        }
        return count;
        
    }
}