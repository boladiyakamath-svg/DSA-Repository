class Solution {
    public int maxArea(int[] heights) {
        int maxarea=0;
        int l=0, r=heights.length-1;
        while(l<r){
            int area= Math.min(heights[l],heights[r])*(r-l);
            if(heights[l]<heights[r])
            l++;
            else
            r--;
            maxarea=Math.max(area,maxarea);
        }
        return maxarea;
    }
}
