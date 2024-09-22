public class LargestWaterContainer {
    public int maxArea(int[] height) {
        int maxArea = 0;
        /*for (int i=0; i<height.length; i++){
            for (int j=i+1; j<height.length; j++){
                int area = Math.min(height[i],height[j]) * (j-i);
                maxArea = Math.max(area,maxArea);
            }
        }*/
        for (int i=0,j=height.length-1; i<j; ){
            int area = Math.min(height[i],height[j]) * (j-i);
            maxArea = Math.max(area,maxArea);
            if(height[i] > height[j])  j++;
            else i++;
        }
        return maxArea;
    }
}
