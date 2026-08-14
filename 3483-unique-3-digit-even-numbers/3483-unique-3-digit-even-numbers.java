class Solution {
    HashSet<Integer> set = new HashSet<>();

    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[digits.length];

        solve(digits, used, 0, 0);

        return set.size();
    }

    private void solve(int[] digits, boolean[] used, int count, int num) {

  
        if (count == 3) {
            if (num % 2 == 0) {
                set.add(num);
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (used[i]) {
                continue;
            }

            if (count == 0 && digits[i] == 0) {
                continue;
            }

            used[i] = true;

            solve(
                digits,
                used,
                count + 1,
                num * 10 + digits[i]
            );

   
            used[i] = false;
        }
    }
}