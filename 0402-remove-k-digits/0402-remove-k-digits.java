class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i <= num.length() - 1; i++) {
            while (!st.isEmpty() && k > 0 && (st.peek() - '0') > (num.charAt(i) - '0')) {
                st.pop();
                k = k - 1;
            }
            st.push(num.charAt(i));
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        if (st.isEmpty()) {
            return "0";
        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        res.reverse();

        int i = 0;
        while (i < res.length() - 1 && res.charAt(i) == '0') {
            i++;
        }
        res.delete(0, i);

        return res.length() == 0 ? "0" : res.toString();
    }
}