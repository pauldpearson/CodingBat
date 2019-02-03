/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */

public class Diff21 {

    private static int diff21(int a) {
        int diff = Math.abs(21 - a);
        if (diff > 21) {
            return diff * 2;
        }
        return diff;
    }

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(44));
    }
}
