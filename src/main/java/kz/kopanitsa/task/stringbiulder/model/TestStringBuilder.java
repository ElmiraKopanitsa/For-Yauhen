package kz.kopanitsa.task.stringbiulder.model;

public class TestStringBuilder {

    private StringBuilder stringBuilder;

    public  TestStringBuilder(){

    }

    public TestStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder toStringBuilder() {
        return stringBuilder;
    }

    public String toString() {
        return stringBuilder.toString();
    }

    public StringBuilder getSum(int x, int y) {
        // метод принимает 2 числа и выдает строку с их суммой
        int sum = x + y;
        StringBuilder result = new StringBuilder();
        result.append(x);
        result.append(" + ");
        result.append(y);
        result.append(" = ");
        result.append(sum);
        return result;
    }

    public StringBuilder getSubtraction(int x, int y) {
        // метод принимает 2 числа и выдает строку с их разностью
        int subtraction = x - y;
        StringBuilder result = new StringBuilder();
        result.append(x);
        result.append(" - ");
        result.append(y);
        result.append(" = ");
        result.append(subtraction);
        return result;
    }

    public StringBuilder getMultiplication(int x, int y) {
        // метод принимает 2 числа и выдает строку с их произведением
        int multiplication = x * y;
        StringBuilder result = new StringBuilder();
        result.append(x);
        result.append(" * ");
        result.append(y);
        result.append(" = ");
        result.append(multiplication);
        return result;
    }

    public String deleteChar(TestStringBuilder string, String str, String str2) {
        // метод с помощью StringBuilder.insert(), StringBuilder.deleteCharAt() заменяет подстроку на другую подстроку
        // string - объект, в котором нужно произвести замену
        // str - подстрока, которую надо заменить
        // str2 - подстрока, вставляемая на место замененной
        StringBuilder result = string.toStringBuilder();
        int index = result.indexOf(str); // определяет индекс
        if (index != -1) {
            result.deleteCharAt(index); // удаляет подстроку
            result.insert(index, str2); // вставляет новую подстроку
            return result.toString();
        } else {
            result = new StringBuilder("Подстрока, которую вы хотите заменить отсутствует.");
            return result.toString();
        }
    }


    public String replaceText(TestStringBuilder string, String str, String str2) {
        // метод с помощью StringBuilder.insert(), StringBuilder.deleteCharAt() заменяет подстроку на другую подстроку
        // string - объект, в котором нужно произвести замену
        // str - подстрока, которую надо заменить
        // str2 - подстрока, вставляемая на место замененной
        StringBuilder result = string.toStringBuilder();
        int index = result.indexOf(str);
        if (index != -1) {
            result.replace(index, index + str.length(), str2);
            return result.toString();
        } else {
            result = new StringBuilder("Подстрока, которую вы хотите заменить отсутствует.");
            return result.toString();
        }
    }
}
