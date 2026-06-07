class Solution {
    public int characterReplacement(String s, int k) {
        char[] chars=s.toCharArray();
        int l=0;
        int r=0;
        int[] hash=new int[26];
        int maxlen=0;
        int maxf=0;
        while(r<chars.length){
            hash[chars[r]-'A']++;
            maxf=Math.max(maxf,hash[chars[r]-'A']);
            while(((r-l+1)-maxf)>k){
                hash[chars[l]-'A']--;
                for(int i=0;i<hash.length;i++){
                   maxf=Math.max(maxf,hash[chars[l]-'A']);    
                }
                l++;
            }
                    maxlen=Math.max(maxlen,r-l+1);
                
                r++;
            }
        
        return maxlen;
        
    }
}