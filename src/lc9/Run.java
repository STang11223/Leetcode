package lc9;

public class Run {
    public static void main(String[] args) {
        new Run(121);
        new Run(-121);
        new Run(10);
    }

    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return sb.toString().contentEquals(sb.reverse());
    }

    Run(int x) {
        System.out.println(isPalindrome(x));
    }
}

