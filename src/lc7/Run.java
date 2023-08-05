package lc7;

public class Run {
    public static void main(String[] args) {
        Run r = new Run();
        System.out.println(r.reverse(123));
        System.out.println(r.reverse(-123));
        System.out.println(r.reverse(120));
    }

    public int reverse(int x) {
        int modifier = x < 0 ? -1 : 1;
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs((long) x)));
        long l = Long.parseLong(sb.reverse().toString());

        return l < Integer.MAX_VALUE && l > Integer.MIN_VALUE ? ((int) l) * modifier : 0;
    }
}
