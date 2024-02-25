import java.util.ArrayList;
import java.util.List;

public class BacktrackingExample {

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(nums, target);
        System.out.println("All combinations that sum up to " + target + ": ");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        } else {
            for (int i = start; i < nums.length; i++) {
                current.add(nums[i]);
                backtrack(nums, target - nums[i], i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
