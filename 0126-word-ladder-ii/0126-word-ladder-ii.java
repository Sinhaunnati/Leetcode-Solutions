class Solution {

    List<List<String>> ans = new ArrayList<>();
    List<String> path = new ArrayList<>();
    Map<String, List<String>> parent = new HashMap<>();

    public List<List<String>> findLadders(
        String beginWord,
        String endWord,
        List<String> wordList
    ) {

        Set<String> set = new HashSet<>(wordList);

        if (!set.contains(endWord)) {
            return ans;
        }

        Map<String, Integer> dist = new HashMap<>();
        Queue<String> q = new LinkedList<>();

        q.add(beginWord);
        dist.put(beginWord, 0);

        boolean found = false;

        while (!q.isEmpty() && !found) {

            int size = q.size();

            while (size-- > 0) {

                String word = q.poll();
                int d = dist.get(word);

                char[] chars = word.toCharArray();

                for (int i = 0; i < chars.length; i++) {

                    char original = chars[i];

                    for (char ch = 'a'; ch <= 'z'; ch++) {

                        if (ch == original) continue;

                        chars[i] = ch;
                        String next = new String(chars);

                        if (!set.contains(next)) {
                            continue;
                        }

                        if (!dist.containsKey(next)) {

                            dist.put(next, d + 1);
                            q.add(next);

                            parent
                                .computeIfAbsent(next, k -> new ArrayList<>())
                                .add(word);

                        }
                        else if (dist.get(next) == d + 1) {

                            parent
                                .computeIfAbsent(next, k -> new ArrayList<>())
                                .add(word);
                        }

                        if (next.equals(endWord)) {
                            found = true;
                        }
                    }

                    chars[i] = original;
                }
            }
        }

        if (!dist.containsKey(endWord)) {
            return ans;
        }

        path.add(endWord);
        dfs(endWord, beginWord);

        return ans;
    }

    private void dfs(String word, String beginWord) {

        if (word.equals(beginWord)) {

            List<String> sequence = new ArrayList<>(path);
            Collections.reverse(sequence);

            ans.add(sequence);
            return;
        }

        if (!parent.containsKey(word)) {
            return;
        }

        for (String p : parent.get(word)) {

            path.add(p);

            dfs(p, beginWord);

            path.remove(path.size() - 1);
        }
    }
}