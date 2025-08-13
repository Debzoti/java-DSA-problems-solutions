package arshGoyalSheet.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class MaxRectangleInBinaryMatrix {
    public int maximalRectangle(char[][] matrix) {
        int[] list = new int[matrix[0].length];
        int maxRect = 0;
        int row =0;

        //copy first row int oi list
        for(int col = 0; col<matrix[row].length; col++){
            if(matrix[row][col] == '0'){
                list[col]=0;
            }else{

                list[col] += 1;
            }        }
        row++;
        
        maxRect=Math.max(maxRect,MaxHistogram(list));

        //iterate and build MHA for ecah row
        for (int i = row; i < matrix.length; i++) {
            buildList(list, matrix, i);
            maxRect=Math.max(maxRect,MaxHistogram(list));

        }

        return maxRect;

    }

    public void buildList(int[] list, char[][] matrix, int row){

        for(int col = 0; col<matrix[row].length; col++){
            if(matrix[row][col] == '0'){
                list[col]=0;
            }else{

                list[col] += 1;
            }
        }
    }

        public int MaxHistogram(int[] heights) {
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

        //calc area
        for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;

    }
}
