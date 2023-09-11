package kz.kopanitsa.task.state._main;

import kz.kopanitsa.task.state.model.entity.ListCitizens;
import kz.kopanitsa.task.state.model.service.ListCitizensService;

public class _Main {
    public static void main(String[] args) {
        ListCitizens listCitizens = new ListCitizens();
        ListCitizensService listCitizensService = new ListCitizensService(listCitizens);
        listCitizensService.menu();
    }
}
