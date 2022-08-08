package org.example.udemy_spring;

import java.util.HashMap;
import java.util.Map;

public class ExRev {
    public int romanToInt(final String roman) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('I', 1);
        characterIntegerMap.put('V', 5);
        characterIntegerMap.put('X', 10);

        char[] characters = roman.toCharArray();//страку делим на массив отдельных символом char

        int total = 0;//изначально пустая строка

        for (int i = 0; i < characters.length; i++) { //извлекаем ключи для мапы
            if ((i + 1) == characters.length) { //
                total = total + characterIntegerMap.get(characters[i]);
                continue;
            }
            int current = characterIntegerMap.get(characters[i]);
            int next = characterIntegerMap.get(characters[i + 1]);
            total = (next <= current) ? total + current : total - current;
        }

        return total;
    }
}
