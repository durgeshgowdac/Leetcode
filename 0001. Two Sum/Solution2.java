import java.util.Map;
import java.util.HashMap;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i=0; i<nums.length; ++i) {
            if (hash.containsKey(nums[i])) {
                return new int[] {hash.get(nums[i]), i};
            }
            hash.put(target-nums[i], i);
        }
        return null;
    }
}