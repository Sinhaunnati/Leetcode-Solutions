class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> st=new HashSet<>();
        for(String word:words){
            String str="";

            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                str+=morse[ch-'a'];
            }
            st.add(str);
        }
        return st.size();
        
    }
}