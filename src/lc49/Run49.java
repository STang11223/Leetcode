package lc49;

import java.util.*;

public class Run49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Arrays.sort(strs);
        Map<String, List<String>> m = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            m.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(str);
        }
        return m.values().stream().toList();
    }
}
