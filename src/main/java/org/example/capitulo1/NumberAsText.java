package org.example.capitulo1;

import java.util.HashMap;

public class NumberAsText {
    private HashMap<Character, String> numbersAsText = new HashMap<>() {{
        put('0', "ZERO");
        put('1', "ONE");
        put('2', "TWO");
        put('3', "THREE");
        put('4', "FOUR");
        put('5', "FIVE");
        put('6', "SIX");
        put('7', "SEVEN");
        put('8', "EIGHT");
        put('9', "NINE");
    }};
    public String intAsString(int num) {
        String valueAsText = "";
        int counter = 0;

        for(char value: String.valueOf(num).toCharArray()) {
            valueAsText += numbersAsText.get(value);
            counter++;
            if(counter != String.valueOf(num).length()) {
                valueAsText += " ";
            }
        }

        return valueAsText;
    }
}
