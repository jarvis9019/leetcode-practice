import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                int[] j = {numsMap.get(target - nums[i]), i};
                return j;
            } else {
                numsMap.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args){
                twoSum(new int[]{2, 7, 11, 15},9);
    }
}
