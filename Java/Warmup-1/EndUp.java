/*
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */

public class EndUp {

    private static String endUp(String str) {

        if (str.length() <= 3) return str.toUpperCase();

        int remove = str.length() - 3;

        String back = str.substring(remove);
        String front = str.substring(0, remove);

        return front + back.toUpperCase();

    }

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }
}
