import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> numsMap = new HashMap<>();
        for(int i=0; i<= nums.length;i++){
            if(!numsMap.containsKey(target-nums[i])){
                numsMap.put(nums[i],i);
            }else{
                int[] j = {i,numsMap.get(target-nums[i])};
                return j;
            }
        }
        return nums;
    }
}
