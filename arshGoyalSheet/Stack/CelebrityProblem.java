package arshGoyalSheet.Stack;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] mat = {
            {1,1,0},
            {0,1,0},
            {0,1,1}
        };

        System.out.println(celebrity(mat));
    }
    //can also be done using 2 pointers o(1) space

    // stack greedy approach o(1) space
    public static int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            if (mat[a][b] ==1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
            
        }

        //only one elememts remain so checkits row eelemnts all 0 and col elemnts are all 1
        int k = stack.pop();
        for (int i = 0; i < n; i++) {
            //skip itself
            if (i==k) {
                continue;
            }

            //chcek rows
            if (mat[k][i] == 1) {
                return -1;
            }

            if (mat[i][k] == 0) {
                return -1;
            }
        }
        return k;

    }
}
