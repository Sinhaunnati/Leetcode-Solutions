class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        while (left <= right) {

            int original = left;
            boolean valid = true;

            while (left != 0) {
                int digit = left % 10;

                if (digit == 0 || original % digit != 0) {
                    valid = false;
                    break;
                }

                left = left / 10;
            }

            if (valid) {
                result.add(original);
            }

            left = original + 1;
        }

        return result;
    }
}