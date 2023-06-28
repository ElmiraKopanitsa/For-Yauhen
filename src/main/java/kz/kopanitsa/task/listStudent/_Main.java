package kz.kopanitsa.task.listStudent;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        System.out.println("Введите через пробел фамилию студента, его оценку, предмет: ");
        Scanner line = new Scanner(System.in);
        String[] listStudent = getList(line);
        printList(listStudent);
    }

    public static String[] getList(Scanner scanner) {
        //приминает строку с консоли и преобразует ее в массив строк
        String[] student = new String[3];
        student[0] = scanner.next();
        student[1] = scanner.next();
        student[2] = scanner.next();
        return student;
    }

    public static void printList(String[] string) {
        // распечатывает массив строк в заданной фразе
        System.out.println("Студент " + string[0] + " получил(a) " + string[1] + " по " + string[2] + ".");
    }
}
