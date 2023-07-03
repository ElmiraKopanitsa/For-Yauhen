package kz.kopanitsa.task.stringbiulder.model;

public class MinCharacterWord {
    public static void main(String[] args) {
        String testString = "fffff ab f 1234 jkjk";
        MinCharacterWord minCharacterWord = new MinCharacterWord();
        System.out.println(minCharacterWord.findMinCharacterWord(testString));
    }

    public String findMinCharacterWord(String text) {
        String[] words = text.split("\\s"); // Разбиваем строку на слова по пробелам
        String minWord = null; // Переменная для хранения слова с минимальным числом различных символов
        int minDistinctCharacters = Integer.MAX_VALUE; // Переменная для хранения минимального числа различных символов

        for (String word : words) {
            int distinctCharacters = countDistinctCharacters(word); // считаем сколько символов в слове
            if (distinctCharacters < minDistinctCharacters) {
                minDistinctCharacters = distinctCharacters;  // если число символов меньше, чем ранее сохраненное, то обновляем минимальное значение на текущее
                minWord = word; // обновляем слово с минимальным количеством символов
            }
        }
        return minWord;
    }

    public int countDistinctCharacters(String word) {
        StringBuilder distinctCharacters = new StringBuilder(); // создаем переменную с изменяемой строкой
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i); // перебираем символы слова
            if (distinctCharacters.indexOf(String.valueOf(ch)) == -1) {
                distinctCharacters.append(ch); // если данного символа нет в изменяемой строке, то добавляем его в distinctCharacters
            }
        }
        return distinctCharacters.length();
    }

}