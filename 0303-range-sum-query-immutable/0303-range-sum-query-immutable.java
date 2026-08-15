class NumArray {
    long []p;
    public NumArray(int[] nums) {
        p = new long[nums.length + 1];
        for(int i=0;i<nums.length;i++){
            
            p[i+1]=p[i]+nums[i];

        }
        
    }
    
    public int sumRange(int left, int right) {
        return (int) (p[right+1]-p[left]);

        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */