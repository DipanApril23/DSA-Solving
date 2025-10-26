// Group Anagrams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Problem5 {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        if (n == 0) return new ArrayList<>();

        HashMap<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);

            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Problem5 sol = new Problem5();
        System.out.println("Group Anagrams: " + sol.groupAnagrams(strs));
    }
}

