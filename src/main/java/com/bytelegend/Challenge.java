package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(concatString(null, null));
        System.out.println(concatString("a", null));
        System.out.println(concatString("a", "b"));
        System.out.println(concatString(null, "b"));
    }

    /**
     * `concatString()` concatenates two `String`s. If any string is `null`, it will be considered
     * as empty string (`""`).
     */
    public static String concatString(String a, String b) {
        return (a == null && b == null) ? "" : ((a == null && b != null) ? b : ((a != null && b == null ? a : ((a != null && b != null) ? a+b : "" ))));
    }
}
