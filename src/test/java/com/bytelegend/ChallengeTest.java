package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals("", Main.concatString("", ""));
        Assertions.assertEquals("a", Main.concatString("a", null));
        Assertions.assertEquals("ab", Main.concatString("a", "b"));
        Assertions.assertEquals("b", Main.concatString(null, "b"));
    }
}
