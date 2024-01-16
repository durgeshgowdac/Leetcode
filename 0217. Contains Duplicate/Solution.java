import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}