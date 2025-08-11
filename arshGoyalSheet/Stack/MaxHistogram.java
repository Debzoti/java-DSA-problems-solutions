package arshGoyalSheet.Stack;

import java.util.Stack;

public class MaxHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        MaxHistogram mh = new MaxHistogram();
        int maxArea = mh.largestRectangleArea(heights);
        System.out.println("Maximum area in histogram: " + maxArea);
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        int maxArea = 0;
        int pseudoLeftIndex = -1;
        int pseudoRightIndex = heights.length;


        //get next smaller left
        for (int i = 0; i < heights.length; i++) {
            while(stack.size() > 0 && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if(stack.empty()) {
                left[i] = pseudoLeftIndex;
            } else {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();

        //get next smaller right
        for (int i = heights.length - 1; i >= 0; i--) {
            while(stack.size() > 0 && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if(stack.empty()) {
                right[i] = pseudoRightIndex;
            } else {
                right[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        // //revese  the right array
        // for (int i = 0; i < right.length / 2; i++) {
        //     int temp = right[i];
        //     right[i] = right[right.length - 1 - i];
        //     right[right.length - 1 - i] = temp;
        // }

        //calc area
        for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;

    }


}
