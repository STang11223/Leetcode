package LC71;

import java.util.Stack;
import java.util.stream.Collectors;

public class Run71 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        for (String s : split) {
            if (s.isEmpty() || s.equals(".")) continue;

            if (s.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
                continue;
            }

            stack.push(s);
        }

        return "/" + String.join("/", stack);
    }
}
