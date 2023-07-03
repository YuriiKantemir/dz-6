package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] testStrings = new String[]{
                "мама", "тато", "їж їжак желе"
        };

        Set<Character> letters = dz_6(testStrings);
        System.out.println(letters);
    }

    public static Set<Character> dz_6(String[] strings) {
        int counter = 0;
        Set<Character> uniqLetters = new HashSet<>();

        for (int i = 0; i < strings.length; i ++) {
            if (counter > 2){
                break;
            }
            String wordFromString = strings[i];
            Map<Character, Integer> letters = new HashMap<>();

            for (char ch : wordFromString.toCharArray()) {

                int count = letters.getOrDefault(ch, 0);

                letters.put(ch, count + 1);

            }

            boolean isEveryLetterOccursTwice = true;
            for (Map.Entry<Character, Integer> pair : letters.entrySet()) {

                if (pair.getValue() != 2){
                    isEveryLetterOccursTwice = false;
                }

            }

            if (isEveryLetterOccursTwice){
                counter++;

                for (Character letter: letters.keySet()) {
                  uniqLetters.add(letter);
                }

            }

        }

        return uniqLetters;
    }
}
