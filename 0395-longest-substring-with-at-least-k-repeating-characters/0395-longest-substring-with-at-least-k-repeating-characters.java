class Solution {
    public int longestSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        int maxLen = 0;

        for (int maxUnique = 1; maxUnique <= 26; maxUnique++) {
            int[] freq = new int[26];
            int left = 0, right = 0;
            int unique = 0, countAtLeastK = 0;

            while (right < chars.length) {
                if (freq[chars[right] - 'a']++ == 0) unique++;
                if (freq[chars[right] - 'a'] == k) countAtLeastK++;
                right++;

                while (unique > maxUnique) {
                    if (freq[chars[left] - 'a'] == k) countAtLeastK--;
                    if (--freq[chars[left] - 'a'] == 0) unique--;
                    left++;
                }

                if (unique == countAtLeastK) {
                    maxLen = Math.max(maxLen, right - left);
                }
            }
        }

        return maxLen;
    }
}