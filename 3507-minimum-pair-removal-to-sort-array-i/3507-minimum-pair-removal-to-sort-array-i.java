import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Long> list = new ArrayList<>();
        for (int num : nums) {
            list.add((long) num);
        }

        int operations = 0;

        while (!isNonDecreasing(list)) {
            int minIndex = 0;
            long minSum = list.get(0) + list.get(1);

            for (int i = 1; i < list.size() - 1; i++) {
                long sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    minIndex = i;
                }
            }

            list.set(minIndex, minSum);
            list.remove(minIndex + 1);

            operations++;
        }

        return operations;
    }

    private boolean isNonDecreasing(List<Long> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}