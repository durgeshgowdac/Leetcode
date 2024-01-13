import java.util.Map;
import java.util.HashMap;

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();

        int left = 0, res = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (!charMap.containsKey(ch) || charMap.get(ch) < left) {
                charMap.put(ch, right);
                res = Math.max(res, right - left + 1);
                continue;
            }
            left = charMap.get(ch) + 1;
            charMap.put(ch, right);
        }

        return res;
    }
}