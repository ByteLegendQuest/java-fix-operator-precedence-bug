package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals("", Challenge.concatString("", ""));
        Assertions.assertEquals("a", Challenge.concatString("a", null));
        Assertions.assertEquals("ab", Challenge.concatString("a", "b"));
        Assertions.assertEquals("b", Challenge.concatString(null, "b"));
    }
}
