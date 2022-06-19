package com.demo.bowling;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Bowling {

    /**
     * Receives an array of integers that represents pins that have been struck by a player's bowling ball and renders the layout of the remaining pins (if any).<br><br>
     * The layout is rendered as follows:
     * <pre>
     *     7 8 9 10
     *      4 5 6
     *       3 2
     *        1
     * </pre>
     */
    String getBowlingPinLayoutAfterThrow(int[] struckPins) {
        Character[] pins = {'I', 'I', 'I', 'I', 'I', 'I', 'I', 'I', 'I', 'I'};

        for (int value : struckPins) {
            pins[value - 1] = ' ';
        }

        return getPinRow(pins, 6, 10, 0)
                .concat("\n")
                .concat(getPinRow(pins, 3, 6, 1))
                .concat("\n")
                .concat(getPinRow(pins, 1, 3, 2))
                .concat("\n")
                .concat(getPinRow(pins, 0, 1, 3));
    }

    private String getPinRow(Character[] pins, int a, int b, int spaces) {
        String spacesString = String.join("", Collections.nCopies(spaces, " "));

        return spacesString.concat(
                    Arrays.stream(Arrays.copyOfRange(pins, a, b))
                        .map(String::valueOf)
                        .collect(Collectors.joining(" "))
                )
                .concat(spacesString);
    }

}
