import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, res = 0;
        for (int right = 0; right < s.length(); ++right) {
            char ch = s.charAt(right);
            if(set.add(ch)) {
                res = Math.max(res, right-left+1);
                continue;
            }
            while(set.contains(ch)) {
                set.remove(s.charAt(left++));
            }
            set.add(ch);
        }
        return res;
    }
}