// class Solution {
//     public int shortestSubarray(int[] nums, int k) {

//         int n = nums.length;
//         int[] prefix = new int[n + 1];

//         for(int i = 0; i < n; i++) {
//             prefix[i + 1] = prefix[i] + nums[i];
//         }

//         int minlen = Integer.MAX_VALUE;

//         for(int i = 0; i < n; i++) {
//             for(int j = i + 1; j <= n; j++) {

//                 int sum = prefix[j] - prefix[i];

//                 if(sum >= k) {
//                     minlen = Math.min(minlen, j - i);
//                 }
//             }
//         }

//         return minlen == Integer.MAX_VALUE ? -1 : minlen;
//     }
// }



// class Solution {
//     public int shortestSubarray(int[] nums, int k) {
//         int left = 0;
//         int right = 0;
//         int sum = 0;
//         int minlen = Integer.MAX_VALUE;

//         while (right < nums.length) {

//             sum += nums[right];

//             while (sum >= k) {
//                 minlen = Math.min(minlen, right - left + 1);

//                 sum -= nums[left];
//                 left++;
//             }

//             right++;
//         }

//         return minlen == Integer.MAX_VALUE ? -1 : minlen;
//     }
// }
class Solution {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

       
        Deque<Integer> dq = new ArrayDeque<>();

        int minlen = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {

         
            while (!dq.isEmpty() && prefix[i] - prefix[dq.peekFirst()] >= k) {

                minlen = Math.min(minlen, i - dq.peekFirst());

                dq.removeFirst();
            }
            while (!dq.isEmpty() && prefix[i] <= prefix[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        return minlen == Integer.MAX_VALUE ? -1 : minlen;
    }
}