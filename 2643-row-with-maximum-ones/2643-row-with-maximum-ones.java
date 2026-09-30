class Solution {
    private int lowerbound(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
  public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int maxOnes = -1;
        int index = -1;

        for (int i = 0; i < n; i++) {
            Arrays.sort(mat[i]);
            int firstOne = lowerbound(mat[i], m, 1);
            int countOnes = m - firstOne;

            if (countOnes > maxOnes) {
                maxOnes = countOnes;
                index = i;
            }
        }

        return new int[]{index, maxOnes};
    }
}