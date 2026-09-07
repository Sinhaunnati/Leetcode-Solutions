class Solution {
    public String removeDuplicateLetters(String s) {

        int[] last = new int[26];


        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> st = new Stack<>();
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (seen[ch - 'a']) {
                continue;
            }
            while (!st.isEmpty()
                    && st.peek() > ch
                    && last[st.peek() - 'a'] > i) {

                seen[st.pop() - 'a'] = false;
            }

            st.push(ch);
            seen[ch - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();

        for (char ch : st) {
            result.append(ch);
        }

        return result.toString();
    }
}