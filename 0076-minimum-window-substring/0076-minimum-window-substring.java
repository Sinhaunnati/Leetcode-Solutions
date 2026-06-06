class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] hash = new int[256];
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;
        int count = 0;

        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }

        while (r < n) {
            
            if (hash[s.charAt(r)] > 0) {
                count++;
            }
            hash[s.charAt(r)]--;
            r++;


            while (count == m) {
                if (r - l < minLen) {       
                    minLen = r - l;
                    sIndex = l;
                }
            
                hash[s.charAt(l)]++;
                if (hash[s.charAt(l)] > 0) {
                    count--;
                }
                l++;
            }
        }

        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);
    }
}