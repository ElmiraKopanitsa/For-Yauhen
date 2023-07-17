package kz.kopanitsa.task.twomiddlecharactersline;

public class _Main {
    public static void main(String[] args) {
        String text = "practice";
        String middleText = twoMiddleCharactersLine(text);
        System.out.println(middleText);
    }

    public static String twoMiddleCharactersLine(String string) {
        // находим два символа в середине четной строкий
        int middle1 = string.length() / 2 - 1; // -1, тк индексы нумеруются с 0, находит индекс слева от середины строки
        int middle2 = middle1 + 1; // находит индекс справа от середины строки
        return string.substring(middle1, middle2 + 1); // +1, тк в диапозон не включается в диапозон
    }
}
