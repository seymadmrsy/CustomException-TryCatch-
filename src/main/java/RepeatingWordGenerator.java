package org.example;
import java.util.*;
import java.util.Arrays;


public class RepeatingWordGenerator {


    public static boolean hasRepeatingChar(String word) {
        Set<Character> seen = new HashSet<>();
        for (char ch : word.toCharArray()) {
            if (!seen.add(ch)) return true; // zaten varsa tekrar ediyor demektir
        }
        return false;
    }


    public static List<String> findFirstTwoRepeatingWords(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (hasRepeatingChar(word)) {
                result.add(word);
                if (result.size() == 2) break;
            }
        }
        return result;
    }


    public static String createRandomTextFromWords(List<String> wordList) {
        Set<Character> uniqueChars = new HashSet<>();
        for (String word : wordList) {
            for (char ch : word.toCharArray()) {
                uniqueChars.add(ch);
            }
        }

        List<Character> charList = new ArrayList<>(uniqueChars);
        Collections.shuffle(charList);

        StringBuilder sb = new StringBuilder();
        for (char ch : charList) {
            sb.append(ch);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        List<String> words = Arrays.asList("kalem", "elalem", "kelam", "kelime");

        System.out.println("Kelime Dizisi: " + words);
        for (String w : words) {
            System.out.println(w + " → " + (hasRepeatingChar(w) ? "tekrarlı harf içeriyor" : "tekrarlı harf içermiyor"));
        }

        List<String> selected = findFirstTwoRepeatingWords(words);
        if (selected.size() == 2) {
            System.out.println("Tekrarlı harf içeren 2 kelime: " + selected);
            String resultText = createRandomTextFromWords(selected);
            System.out.println("Oluşturulan metin: " + resultText);
        } else {
            System.out.println("Tekrarlı harf içeren kelime bulunamadı.");
        }
    }
}

