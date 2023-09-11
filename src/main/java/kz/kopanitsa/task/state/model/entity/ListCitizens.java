package kz.kopanitsa.task.state.model.entity;

import java.util.*;

public class ListCitizens {
    private List<Citizen> citizenList;

    public ListCitizens() {
        this.citizenList = generateCitizenList();
    }

    public List<Citizen> getCitizenList() {
        return citizenList;
    }

    private void setCitizenList(List<Citizen> citizenList) {
        this.citizenList = citizenList;
    }

    private List<Citizen> generateCitizenList() {
        List<Citizen> citizenList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            citizenList.add(new Citizen());
        }
        return citizenList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Citizen citizen : citizenList) {
            stringBuilder.append(citizen.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
