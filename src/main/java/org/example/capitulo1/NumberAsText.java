package org.example.capitulo1;

import java.util.Map;

public class NumberAsText {
    private Map<Character, String> numbersAsText = Map.of(
            '0', "ZERO",
            '1', "ONE",
            '2', "TWO",
            '3', "THREE",
            '4', "FOUR",
            '5', "FIVE",
            '6', "SIX",
            '7', "SEVEN",
            '8', "EIGHT",
            '9', "NINE"
    );
    public String intAsString(int num) {
        String valueAsText = "";

        for (char value: String.valueOf(num).toCharArray()) {
            valueAsText += numbersAsText.get(value) + " ";
        }

        return valueAsText.trim();
    }
}
