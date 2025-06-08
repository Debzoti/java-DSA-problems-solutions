package arshGoyalSheet.Arrays;

public class Trappingwater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    static int trap(int[] height){
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        int water = 0;

        //base case when 2 pointers meet
        while(left < right){
            //chcek right and left height move the lower height pointer 
            //because that controls water is going to be stored in that index
            
            if(height[left] < height[right]){
                //check it greater tnan leftsmax so it cant store water
                if(height[left]>leftMax){
                    leftMax=height[left];

                }else{
                    water+=(leftMax-height[left]);
                }
                left++;
            }else{
                //check it greater than rightmax so it cant store water
                 if(height[right]>rightMax){
                    rightMax=height[right];

                }else{
                    water+=(rightMax-height[right]);
                }
                right--;
            }

        } 

        return water;
    }
}
