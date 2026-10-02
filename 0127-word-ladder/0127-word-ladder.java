class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(beginWord, 1));

        HashSet<String> st = new HashSet<>(wordList);

        st.remove(beginWord);

        while (!q.isEmpty()) {

            String word = q.peek().word;
            int steps = q.peek().steps;

            q.remove();

            if (word.equals(endWord)) {
                return steps;
            }

            for (int i = 0; i < word.length(); i++) {

                char original = word.charAt(i);

                for (char ch = 'a'; ch <= 'z'; ch++) {

                    char[] chars = word.toCharArray();
                    chars[i] = ch;

                    String newWord = new String(chars);

                    if (st.contains(newWord)) {

                        st.remove(newWord);

                        q.add(new Pair(newWord, steps + 1));
                    }
                }

            }
        }

        return 0;
    }

    static class Pair {
        String word;
        int steps;

        Pair(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }
}