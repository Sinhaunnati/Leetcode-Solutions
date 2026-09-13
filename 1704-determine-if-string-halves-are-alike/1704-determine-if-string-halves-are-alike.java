class Solution {
    public boolean halvesAreAlike(String s) {
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<(s.length()/2);i++){
            if(isVowel(s.charAt(i))) cnt1++;
        }
        for(int i=(s.length()/2);i<s.length();i++){
            if(isVowel(s.charAt(i))) cnt2++;
        }
        return cnt1==cnt2;
        
    }
    private boolean isVowel(char ch){
         return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}