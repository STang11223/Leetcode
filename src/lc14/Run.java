package lc14;

public class Run {
    public static void main(String[] args) {
        new Run(new String[]{"flower", "flow", "flight"});
        new Run(new String[]{"dog","racecar","car"});
        new Run(new String[]{"dog","racecar",""});
        new Run(new String[]{""});
        new Run(new String[]{"one"});
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int shortest = 200;
        for (String s : strs) {
            shortest = Math.min(s.length(), shortest);
        }

        for (int i = 0; i < shortest; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) return sb.toString();
            }
            sb.append(c);
        }

        return sb.toString();
    }

    Run(String[] s) {
        System.out.println(longestCommonPrefix(s));
    }
}
