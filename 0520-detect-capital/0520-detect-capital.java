class Solution {
    public boolean detectCapitalUse(String word) {
        boolean firstUpper = (word.charAt(0) >= 65 && word.charAt(0) <= 90);
        
        if (firstUpper) {
            boolean allUpper = true;
            for (int i = 1; i < word.length(); i++) {
                if (!(word.charAt(i) >= 65 && word.charAt(i) <= 90)) {
                    allUpper = false;
                    break;
                }
            }
            
            boolean restLower = true;
            for (int i = 1; i < word.length(); i++) {
                if (!(word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
                    restLower = false;
                    break;
                }
            }
            
            return allUpper || restLower;
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (!(word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
                    return false;
                }
            }
            return true;
        }
    }
}