class Solution {
    public char kthCharacter(int k) {
        if (k == 1) return 'a';

        int len = 1;
        while (len < k) len *= 2;
        int half = len / 2;

        if (k <= half) {
            return kthCharacter(k);        
        } else {
            char prev = kthCharacter(k - half); 
            return (char) ((prev - 'a' + 1) % 26 + 'a'); 
        }
    }
}