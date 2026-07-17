/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        int[] nums=ConvertLLtoArr(head);
        int[] ans= doubleArrayNumber(nums);
        ListNode temp=arrayToLinkedList(ans);
        return temp;
      
    }
    private int[] doubleArrayNumber(int[] digits) {
    int n = digits.length;
    int[] result = new int[n + 1]; 
    int carry = 0;

    for (int i = n - 1; i >= 0; i--) {
        int doubled = digits[i] * 2 + carry;
        result[i + 1] = doubled % 10;
        carry = doubled / 10;
    }
    result[0] = carry;

    if (result[0] == 0) {
        return Arrays.copyOfRange(result, 1, result.length);
    }
    return result;
}


    private int[] ConvertLLtoArr(ListNode head) {
    List<Integer> list = new ArrayList<>();
    while (head != null) {
        list.add(head.val);
        head = head.next;
    }
    int[] arr = new int[list.size()];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = list.get(i);
    }
    return arr;
}


private ListNode arrayToLinkedList(int[] arr) {
    if (arr.length == 0) return null;

    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    for (int val : arr) {
        current.next = new ListNode(val);
        current = current.next;
    }

    return dummy.next;
}
}