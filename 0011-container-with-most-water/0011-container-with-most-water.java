class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res=0;
        int area;
        while(l<r){
            area=(r-l)*Math.min(height[l],height[r]);
            res=Math.max(res,area);

            if(height[l]<height[r]){
                l=l+1;
            
            }
            else{

                r=r-1;
            }
        }
        return res;
    }
}