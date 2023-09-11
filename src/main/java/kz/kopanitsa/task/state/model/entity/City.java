package kz.kopanitsa.task.state.model.entity;

import java.util.*;

public class City {

    private String cityName;

    private static List<String> cityNames = new ArrayList<>();

    static {
        cityNames.add("Астана");
        cityNames.add("Алматы");
        cityNames.add("Шымкент");
        cityNames.add("Караганда");
        cityNames.add("Актобе");
        cityNames.add("Тараз");
        cityNames.add("Павлодар");
        cityNames.add("Усть-Каменогорск");
        cityNames.add("Семей");
        cityNames.add("Костанай");
        cityNames.add("Атырау");
        cityNames.add("Петропавловск");
        cityNames.add("Орал");
        cityNames.add("Талдыкорган");
        cityNames.add("Кокшетау");
        cityNames.add("Темиртау");
        cityNames.add("Экибастуз");
        cityNames.add("Рудный");
        cityNames.add("Туркестан");
        cityNames.add("Сатпаев");
        cityNames.add("Байконыр");
    }

    public City() {
        this.cityName = getCityName();
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        Random random = new Random();
        int randomIndex = random.nextInt(cityNames.size());
        return cityNames.get(randomIndex);
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public static List<String> getCityNames() {
        return cityNames;
    }

    public static void setCityNames(String cityName) {
        cityNames.add(cityName);
    }

    @Override
    public String toString() {
        return cityName;
    }
}
