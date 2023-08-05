package lc13;

import java.util.HashMap;
import java.util.Map;

public class Run {
    public static void main(String[] args) {
        new Run("III");
        new Run("LVIII");
        new Run("MCMXCIV");
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>() {{
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }};
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (i == s.length() - 1) {
                num += map.get(a);
                break;
            }
            char b = s.charAt(i + 1);
            if (map.get(a) < map.get(b)) {
                num += map.get(b) - map.get(a);
                i++;
            } else {
                num += map.get(a);
            }
        }

        return num;
    }

    Run(String s) {
        System.out.println(romanToInt(s));
    }
}
