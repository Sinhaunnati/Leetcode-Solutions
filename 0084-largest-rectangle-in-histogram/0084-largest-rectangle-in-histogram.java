import java.util.Stack;

public class Solution {
    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
     
            int currHeight = (i == n) ? 0 : arr[i];

            while (!st.isEmpty() && arr[st.peek()] > currHeight) {
                int element = st.peek();
                st.pop();

                int nse = i; 
                int pse = st.isEmpty() ? -1 : st.peek(); 

                int width = nse - pse - 1;
                int area = arr[element] * width;

                maxArea = Math.max(area, maxArea);
            }
            st.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(arr));
    }
}