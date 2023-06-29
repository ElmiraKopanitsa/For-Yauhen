package kz.kopanitsa.task.RegexDemo;

import java.util.Arrays;

public class MinCharacterWord {
    public static void main(String[] args) {
        String testString = "fffff ab f 1234 jkjk";
        System.out.println(getWord(testString));
    }

    public static int getAmounCharWord(String string) {
        StringBuilder characterWord = new StringBuilder();
        StringBuilder addWord = new StringBuilder(string);
        for (int i = 0; i < addWord.length(); i++) {
            // проверяем количество уникальных символов в слове и добавляем в characterWord
            char ch = addWord.charAt(i); // находим символ
            String letter = String.valueOf(ch); //  превращаем символ в строку
            int index = characterWord.indexOf(letter); // определяем индекс символа в characterWord, если его нет, то возвращает -1
            if (index == -1) {
                characterWord.append(letter); //  добавлем только символы, которых еще нет в characterWord
            }
        }
        return characterWord.length();
    }

    public static String getWord(String string) {
        String[] words = string.split("\\s");
        int[] lenghtArray = new int[words.length];
        for (String word : words) {
            // проходимся по массиву из слов
            for (int i = 0; i < lenghtArray.length; i++) {
                // создаем массив lenghtArray из чисел уникальных символов в словах
                lenghtArray[i] = getAmounCharWord(word);
            }
        }
        int min = Arrays.stream(lenghtArray).min().getAsInt();
        int minIndex = 0;
        for (int j = 0; j < lenghtArray.length; j++) {
            // находим индекс первого наимельшего числа в массиве lenghtArray
            if (lenghtArray[j] == min) {
                minIndex = j;
                break;
            }
        }
        return words[minIndex];
    }
}