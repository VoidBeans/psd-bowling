package com.demo.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingTest {

    @Test
    void getBowlingPinLayoutAfterThrow_Miss() {
        final String expectedLayout =
                "I I I I\n" +
                " I I I \n" +
                "  I I  \n" +
                "   I   ";

        assertEquals(expectedLayout, new Bowling().getBowlingPinLayoutAfterThrow(new int[] {}));
    }

    @Test
    void getBowlingPinLayoutAfterThrow_Strike() {
        final String expectedLayout =
                "       \n" +
                "       \n" +
                "       \n" +
                "       ";

        assertEquals(expectedLayout, new Bowling().getBowlingPinLayoutAfterThrow(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    void getBowlingPinLayoutAfterThrow_Wipeout_1_2_3() {
        final String expectedLayout =
                "I I I I\n" +
                " I I I \n" +
                "       \n" +
                "       ";

        assertEquals(expectedLayout, new Bowling().getBowlingPinLayoutAfterThrow(new int[] {1, 2, 3}));
    }

    @Test
    void getBowlingPinLayoutAfterThrow_Wipeout_6_10() {
        final String expectedLayout =
                "I I I  \n" +
                " I I   \n" +
                "  I I  \n" +
                "   I   ";

        assertEquals(expectedLayout, new Bowling().getBowlingPinLayoutAfterThrow(new int[] {6, 10}));
    }

    @Test
    void getBowlingPinLayoutAfterThrow_Wipeout_1_2_3_4_7_8() {
        final String expectedLayout =
                "    I I\n" +
                "   I I \n" +
                "       \n" +
                "       ";

        assertEquals(expectedLayout, new Bowling().getBowlingPinLayoutAfterThrow(new int[] {8, 1, 4, 2, 3, 7}));
    }

}
