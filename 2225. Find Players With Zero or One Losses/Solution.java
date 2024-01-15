import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] arr = new int[100001];
        int max = Integer.MIN_VALUE;
        for (int[] match: matches) {
            if (arr[match[0]] == 0) arr[match[0]] = -1;
            if (arr[match[1]] <= 0) arr[match[1]] = 1;
            else arr[match[1]] += 1;
            max = Math.max(max, Math.max(match[0], match[1]));
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for (int i=1; i<=max; ++i) {
            if (arr[i] == -1) res.get(0).add(i);
            if (arr[i] == 1) res.get(1).add(i);
        }
        return res;
    }
}