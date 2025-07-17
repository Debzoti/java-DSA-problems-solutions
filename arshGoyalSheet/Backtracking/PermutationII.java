import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationII{
    List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1, 1,1, 2};
        List<Integer> curr = new ArrayList<>();
        PermutationII p = new PermutationII();
        p.permute(nums,0,curr);
        System.out.println(p.res);
    }

    public void permute(int[] nums, int start, List<Integer> curr){
        //base case
        if (start == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        //hasshset
        HashSet<Integer> set = new HashSet<>();
        //loop to swap and backtrack
        for (int index = start; index < nums.length; index++) {
            //chcek in the set
            if (set.contains(nums[index])) {
                continue;
            }
            set.add(nums[index]);
            curr.add(nums[index]);
            //swap indices
            swap(nums,start,index);
            permute(nums, start+1, curr);
            swap(nums,start,index); //backtrack
            curr.remove(curr.size()-1);


        }
    }

    static void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}