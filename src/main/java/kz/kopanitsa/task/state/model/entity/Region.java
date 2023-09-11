package kz.kopanitsa.task.state.model.entity;

import java.util.*;

public class Region {

    private String regionName;
    private static List<String> regionNames = new ArrayList<>();
        static {
            regionNames.add("Акмолинская область");
            regionNames.add("Актюбинская область");
            regionNames.add("Алматинская область");
            regionNames.add("Атырауская область");
            regionNames.add("Восточно-Казахстанская область");
            regionNames.add("Жамбылская область");
            regionNames.add("Западно-Казахстанская область");
            regionNames.add("Карагандинская область");
            regionNames.add("Костанайская область");
            regionNames.add("Кызылординская область");
            regionNames.add("Мангистауская область");
            regionNames.add("Павлодарская область");
            regionNames.add("Северо-Казахстанская область");
            regionNames.add("Туркестанская область");
            regionNames.add("Астана");
            regionNames.add("Алматы");
            regionNames.add("Байконыр");
        }

    public Region() {
        this.regionName = getRegionName();
    }

    public Region(String name) {
        this.regionName = name;
    }

    public String getRegionName() {
        Random random = new Random();
        int randomIndex = random.nextInt(regionNames.size());
        return regionNames.get(randomIndex);
    }

    public void setRegionName(String name) {
        this.regionName = name;
    }

    public static List<String> getRegionNames() {
        return regionNames;
    }

    public static void setRegionNames(String regionName) {
        regionNames.add(regionName);
    }

    @Override
    public String toString() {
            return regionName;
    }
}
