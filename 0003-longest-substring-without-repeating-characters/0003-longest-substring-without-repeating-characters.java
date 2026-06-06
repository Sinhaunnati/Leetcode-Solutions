class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars=s.toCharArray();
        HashMap<Character,Integer> mpp=new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<chars.length){
            mpp.put(chars[right],mpp.getOrDefault(chars[right],0)+1);
            while(mpp.get(chars[right])>1){
                 mpp.put(chars[left],mpp.getOrDefault(chars[left],0)-1);
                 left++;
                
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}