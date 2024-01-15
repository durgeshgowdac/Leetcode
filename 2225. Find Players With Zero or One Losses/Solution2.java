import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution2 {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        for (int[] match: matches) {
            map.put(match[0], map.getOrDefault(match[0], 0));
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) continue;
            list.get(entry.getValue()).add(entry.getKey());
        }
        Collections.sort(list.get(0));
        Collections.sort(list.get(1));
        return list;
    }
}