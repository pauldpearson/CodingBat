/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

public class FrontBack {

    private static String frontBack(String str) {
        if (str.length() <= 1) return str;

        char front = str.charAt(0);
        String mid = str.substring(1, str.length() - 1);
        char back = str.charAt(str.length() -1);

        return back + mid + front;
    }

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }
}
