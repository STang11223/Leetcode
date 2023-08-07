package lc65;

import java.util.Stack;

public class Run65 {

    /**
     * Rules:
     * Number is valid if it's a decimal or integer
     * - e or E followed by an integer, e/E cannot have a dot after (optional)
     * <p>
     * Number is decimal if
     * - has + or - sign, wrapped in digit unless it's in front (optional)
     * - has a dot wrapped in one or more digits
     * <p>
     * Number is integer if
     * - has + or - sign, wrapped in digit unless it's in front (optional)
     * - has one or more digits
     * <p>
     * -- Condition List --
     * [e/E] cannot have a dot after. cannot have a dot next to it.
     * - can have a sign next to it. must be wrapped by digit or sign. cannot have multiple e/E
     * sign[+/-] can only exist in the front, or after e/E. cannot exist next to another sign.
     * - cannot end sequence
     * dot[.] cannot be next to e/E. cannot stand alone
     * cannot be any other letter besides e/E
     *
     * @param s
     * @return
     */
    public boolean isNumber(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isfirst = true, islast = false, hasDot = false, hasE = false, dotFirst = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == s.length() - 1) islast = true;

            // letter check
            if (Character.isLetter(c)) {
                if ((c != 'e' && c != 'E') || isfirst || islast || (stack.peek() == '.' && dotFirst) || stack.peek() == 'e' || stack.peek() == 'E' || stack.peek() == '+' || stack.peek() == '-' || hasE)
                    return false;
                stack.add(c);
                hasE = true;
            }

            if (c == '+' || c == '-') {
                if ((isfirst || stack.peek() == 'e' || stack.peek() == 'E') && !islast) stack.add(c);
                else return false;
            }

            if (c == '.') {
                if (s.length() == 1 || (!stack.isEmpty() && (stack.peek() == 'e' || stack.peek() == 'E')) || hasDot || hasE || islast && !Character.isDigit(stack.peek()))
                    return false;
                hasDot = true;
                if (stack.isEmpty() || !Character.isDigit(stack.peek())) dotFirst = true;
                stack.add(c);
            }
            if (isfirst) isfirst = false;
            if (Character.isDigit(c)) stack.add(c);
        }
        return true;
    }
}
