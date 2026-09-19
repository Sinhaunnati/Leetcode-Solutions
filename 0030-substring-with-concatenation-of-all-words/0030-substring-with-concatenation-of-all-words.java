// class Solution {

//     void solve(String s, String[] words, int count, boolean[] used,
//                String current, int start, List<Integer> ans) {

//         if (count == words.length) {
//             ans.add(start);
//             return;
//         }

//         int wordLength = words[0].length();

//         for (int i = 0; i < words.length; i++) {

//             if (i > 0 &&
//                 words[i].equals(words[i - 1]) &&
//                 !used[i - 1]) {
//                 continue;
//             }

//             if (!used[i]) {

//                 int left = start + count * wordLength;
//                 int right = left + wordLength;

//                 String part = s.substring(left, right);

//                 if (!words[i].equals(part)) {
//                     continue;
//                 }

          
//                 used[i] = true;
//                 current += words[i];

//                 solve(s, words, count + 1, used,
//                       current, start, ans);

           
//                 current = current.substring(
//                     0,
//                     current.length() - words[i].length()
//                 );

//                 used[i] = false;
//             }
//         }
//     }

//     public List<Integer> findSubstring(String s, String[] words) {

//         List<Integer> ans = new ArrayList<>();

//         Arrays.sort(words);

//         int wordLength = words[0].length();
//         int totalLength = wordLength * words.length;

//         for (int start = 0;
//              start <= s.length() - totalLength;
//              start++) {

//             boolean[] used = new boolean[words.length];

//             solve(s, words, 0, used, "", start, ans);
//         }

//         return ans;
//     }
// }
class Solution {

 public List<Integer> findSubstring(String s, String[] words) {
     List<Integer> ans = new ArrayList<>();

        int wordLength=words[0].length();
        int wordCount=words.length;

        HashMap<String,Integer> required=new HashMap<>();
        for( String word:words){
            required.put(word,required.getOrDefault(word,0)+1);
        }
        for(int start=0;start<wordLength;start++){
            int left=start;
            int right=start;
            HashMap<String,Integer> seen=new HashMap<>();
            int count=0;

            while(right+wordLength<=s.length()){
                String word=s.substring(right,right+wordLength);
                right+=wordLength;


                if(!required.containsKey(word)){
                    seen.clear();
                    
                    count=0;
                    left=right;
                    continue;
                }
                seen.put(word,seen.getOrDefault(word,0)+1);
                count++;

                while(seen.get(word)>required.get(word)){
                    String leftWord=s.substring(left,left+wordLength);
                    seen.put(leftWord,seen.get(leftWord)-1);

                
                left+=wordLength;
                count--;
                }
                if(count==wordCount){
                    ans.add(left);
                     String leftWord=s.substring(left,left+wordLength);
                    seen.put(leftWord,seen.get(leftWord)-1);

                
                left+=wordLength;
                count--;

                }



            }



        }
        return ans;
        
   


 }
 }