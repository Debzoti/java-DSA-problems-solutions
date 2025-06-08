package arshGoyalSheet.Arrays;

public class ContainingWater {
   public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(maxArea(height));
   }
   static int maxArea(int[] height){
    int left = 0, right = height.length -1 ;
    int area = 0, maxArea = 0;

    while(left<right){
        area =( Math.min(height[left],height[right]) * (right - left) );
        //maxArea= Math.max(area,maxArea);
        if(height[left]<=height[right]){
            left++;
        }else{
            right--;
        }
        maxArea= Math.max(area,maxArea);
    }

    return maxArea;
   }
}
