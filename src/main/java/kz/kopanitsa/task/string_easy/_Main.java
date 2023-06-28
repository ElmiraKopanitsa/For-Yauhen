package kz.kopanitsa.task.string_easy;

public class _Main {
    public static void main(String[] args) {

        String test = "I like Java!!!";
        printString(test);
        System.out.println(test.charAt(test.length() - 1)); // печать последнего символа строки методом  String.charAt()
        checkEnd(test, "!!!"); // проверяет окончание строки на <!!!>
        checkStart(test, "I like"); // проверяет начало строки и выдает true или false
        itContains(test, "Java"); // проверяет содержит ли строка подстроку
        int index = test.indexOf("Java"); // находит позицию подстроки в строке
        System.out.println(index);
        test = test.replaceAll("a", "o"); // меняет все а на о
        test = test.toUpperCase(); // приводит к верхнему регистру
        test = test.toLowerCase(); // приводит к нижнему регистру
        test = test.substring(7); // вырезает подстроку с 7 индекса

        String text = "Object-oriented programming is a programming language model " +
                "organized around objects rather than \"actions\" and data rather than logic. " +
                "Object-oriented programming blabla. Object-oriented programming bla.";
        String oldSubstring = "object-oriented programming";
        String newSubstring = "OOP";
        System.out.println(replaceTwoSubstring(text, oldSubstring, newSubstring));

    }

    public static void printString(String string) {
        // метод принимает строку
        System.out.println("Вот ваша строка: " + string);
    }

    public static void checkEnd(String string, String str) {
        // метод с помощью метода String.endsWith() проверяет окончание строки
        if (string.endsWith(str)) {
            System.out.println("Ваша строка \"" + string + "\" заканчивается на " + str);
        } else {
            System.out.println("Ваша строка \"" + string + "\" не заканчивается на " + str);
        }
    }

    public static void checkStart(String string, String str) {
        // метод с помощью метода String.startsWith() проверяет окончание строки
        if (string.startsWith(str)) {
            System.out.println("Ваша строка \"" + string + "\" начинается на " + str);
        } else {
            System.out.println("Ваша строка \"" + string + "\" не начинается на " + str);
        }
    }

    public static void itContains(String string, String str) {
        // метод с помощью метода String.contains() проверяет содержит ли строка подстроку
        if (string.contains(str)) {
            System.out.println("Ваша строка \"" + string + "\" содержит подстроку " + str);
        } else {
            System.out.println("Ваша строка \"" + string + "\" не содержит подстроку " + str);
        }
    }

    public static String replaceTwoSubstring(String string, String oldSubstring, String newSubstring) {
        // метод, заменяющий в строке каждое второе вхождение подстроки
        int count = 0; // устанавливаем счетчик
        StringBuilder result = new StringBuilder(string.toLowerCase()); // преобразуем String в StringBuilder
        int index = result.indexOf(oldSubstring); // определяем индект подстроки, которую надо заменить на втором вхождении

        while (index != -1) {
            count++; // цикл работает пока в строке есть соответствующая подстрока
            if (count % 2 == 0) {
                result.replace(index, index + oldSubstring.length(), newSubstring);
            }
            index = result.indexOf(oldSubstring, index + 1);
        }
        return result.toString();
    }
}
