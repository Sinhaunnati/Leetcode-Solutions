class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for (int[] row : image) {
            int left = 0, right = row.length - 1;
            while (left < right) {
                int t = row[left];
                row[left] = row[right];
                row[right] = t;
                left++;
                right--;
            }
        }

       int rows = image.length;
int cols = image[0].length;

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++){
        if(image[i][j]==1){
            image[i][j]=0;
        }
        else{
            image[i][j]=1;
        }


    }
        
    }
    return image;
    }
}