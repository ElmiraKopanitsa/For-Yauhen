package kz.kopanitsa.task.state.model.service;

import kz.kopanitsa.task.state.model.entity.Citizen;
import kz.kopanitsa.task.state.model.entity.ListCitizens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCitizensService {
    private final ListCitizens listCitizens;

    public ListCitizensService(ListCitizens listCitizens) {
        this.listCitizens = listCitizens;
    }
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean nextChoice = true;
        while(nextChoice) {
            System.out.println("Меню: ");
            System.out.println("1 - Вывести на консоль столицу");
            System.out.println("2 - Вывести на консоль количество областей");
            System.out.println("3 - Вывести на консоль площадь государства");
            System.out.println("4 - Вывести на консоль областные центры");
            System.out.println("5 - Вывести на консоль средний возраст жителей");
            System.out.println("6 - Вывести на консоль жителей у которых имя состоит " +
                    "из n букв (чисто n  вводится  с клавиатуры)");
            System.out.println("7 - Вывести на консоль список жителей " +
                    "у которых имя начинается с буквы m (буква m вводится с клавиатуры)");
            System.out.println("8 - Выход");
            System.out.println("Выберите действие (1-8): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Столица Казахстана - Астана.");
                    break;
                case 2:
                    System.out.println("В Казахстане 16 областей, " +
                            "один город республиканского значения (Астана, столица страны) " +
                            "и один город федерального подчинения (Байконыр). ");
                    break;
                case 3:
                    System.out.println("Общая площадь Казахстана составляла около 2 724 900 квадратных километров.");
                    break;
                case 4:
                    System.out.println("Акмолинская область - Кокшетау\n" +
                            "Актюбинская область - Актобе\n" +
                            "Алматинская область - Талдыкорган\n" +
                            "Атырауская область - Атырау\n" +
                            "Восточно-Казахстанская область - Усть-Каменогорск\n" +
                            "Жамбылская область - Тараз\n" +
                            "Западно-Казахстанская область - Уральск\n" +
                            "Карагандинская область - Караганда\n" +
                            "Костанайская область - Костанай\n" +
                            "Кызылординская область - Кызылорда\n" +
                            "Мангистауская область - Актау\n" +
                            "Павлодарская область - Павлодар\n" +
                            "Северо-Казахстанская область - Петропавловск\n" +
                            "Туркестанская область - Туркестан");
                    break;
                case 5:
                    System.out.println("Средний возраст жителей: " + getAverageAge(listCitizens));
                    break;

                case 6:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите число n, " +
                            "чтобы получить список жителей, у которых имя состоит из n букв");
                    int number = sc.nextInt();
                    System.out.println("Вот список людей, чьи имена состоят из " + number + " букв:\n"
                            + getNameNumberLength(number, listCitizens));
                    break;

                case 7:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Введите букву английского алфавита, " +
                            "чтобы получить список жителей, чьи имена начинаются на данную букву.");
                    char letter = sc1.next().charAt(0);
                    System.out.println("Вот список людей, чьи имена начинаются на '" + letter + "' :\n"
                            + getNameStartChar(letter, listCitizens));
                    break;
                case 8:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    nextChoice = false;
                    break;
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, выберите действие от 1 до 8.");
            }

        }
    }

    public Integer getAverageAge(ListCitizens listCitizens) {
        List<Integer> ageCitizensList = new ArrayList<>();
        Integer averageAge = 0;
        int count = 0;
        for (Citizen citizen : listCitizens.getCitizenList()) {
            ageCitizensList.add(citizen.getAge());
            count += 1;
        }
        for (Integer age : ageCitizensList) {
            averageAge += age;
        }
        if (count > 0) {
            averageAge /= count;
        }
        return averageAge;
    }

    public String getNameNumberLength(int number, ListCitizens listCitizens) {
        StringBuilder namesList = new StringBuilder();
        for (Citizen citizen : listCitizens.getCitizenList()) {
            if (citizen.getFirstName().length() == number) {
                namesList.append(citizen.getFirstName());
                namesList.append(",\n");
            }
        }
        return namesList.toString();
    }

    public String getNameStartChar(char letter, ListCitizens listCitizens) {
        StringBuilder namesList = new StringBuilder();
        for (Citizen citizen : listCitizens.getCitizenList()) {
            if (citizen.getFirstName().charAt(0) == letter) {
                namesList.append(citizen.getFirstName());
                namesList.append(",\n");
            }
        }
        return namesList.toString();
    }
}
