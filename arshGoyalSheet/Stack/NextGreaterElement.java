package arshGoyalSheet.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr1 = {4,1,2};
        int[] arr2 = {1,3,4,2};
        int[] res = findGreater(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }

    static int[] findGreater( int[] nums1, int[] nums2 ){
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        //ArrayList<Integer> list = new ArrayList<>();

        //find next greater of all elemnt sin nums2
        for (int i = nums2.length -1 ; i >= 0; i--) {
            if (s.empty()) {
                map.put(nums2[i], -1);
            }else if(s.size()>0 && s.peek() > nums2[i]){
               map.put(nums2[i], s.peek());
            }else{
                while(s.size() > 0 && s.peek() <= nums2[i]){
                    s.pop();
                }

                if (s.size() == 0) {
                    map.put(nums2[i], -1);
                } else {
                    map.put(nums2[i], s.peek());
                }
            }
            s.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            ans[i]=map.get(nums1[i]);
        }


        return ans;
    }
}
