class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        List<int[]> ones1=new ArrayList<>();
        for(int r1=0;r1<img1.length;r1++){
            for(int c1=0;c1<img1.length;c1++){
                if(img1[r1][c1]==1){
                    ones1.add(new int[]{r1,c1});
                }
            }
        }
        List<int[]> ones2=new ArrayList<>();
        for(int r2=0;r2<img2.length;r2++){
            for(int c2=0;c2<img1.length;c2++){
                if(img2[r2][c2]==1){
                    ones2.add(new int[]{r2,c2});
                }
            }
        }
        int ans=0;

        HashMap<String, Integer> mpp = new HashMap<>();
        for(int[] p1:ones1){
            for(int[] p2:ones2){
                int rowShift=p2[0]-p1[0];
                int colShift=p2[1]-p1[1];
                String key=rowShift + "," +colShift;
                mpp.put(key,mpp.getOrDefault(key,0)+1);
                ans=Math.max(ans,mpp.get(key));
                
            }
        }
        return ans;
        


        
    }
}