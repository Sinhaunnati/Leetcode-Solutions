// class Solution {
//     public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        // int first = -1;
        // int last = -1;
        // int minDist = Integer.MAX_VALUE;
        
        // ListNode prev = head;
        // ListNode curr = head.next;
        
        // int index = 1;
        
        // while (curr.next != null) {
        //     if ((curr.val > prev.val && curr.val > curr.next.val) ||
        //         (curr.val < prev.val && curr.val < curr.next.val)) {
        //         if (first == -1) {
        //             first = index;
        //         }
        //         if (last != -1) {
        //             minDist = Math.min(minDist, index - last);
        //         }
        //         last = index;
        //     }
        //     prev = curr;
        //     curr = curr.next;
        //     index++;
        // }
        // if (first == -1 || first == last) {
        //     return new int[]{-1, -1};
        // }
        // int maxDist = last-first;
        // return new int[]{minDist, maxDist};
        class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;
        int count = 0;

        while (curr.next != null) {

            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                mpp.put(count, index);
                count++;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if (count < 2) {
            return new int[]{-1, -1};
        }

        int minDist = Integer.MAX_VALUE;

        for (int i = 1; i < count; i++) {
            int dist = mpp.get(i) - mpp.get(i - 1);
            minDist = Math.min(minDist, dist);
        }

        int maxDist = mpp.get(count - 1) - mpp.get(0);

        return new int[]{minDist, maxDist};
    }
}
    
