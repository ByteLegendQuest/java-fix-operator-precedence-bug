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
    public static String concatString(String str1, String str2) {
        if (str1 == null) {
            str1 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str1 + str2;
    }
}
