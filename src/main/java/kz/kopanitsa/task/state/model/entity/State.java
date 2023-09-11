package kz.kopanitsa.task.state.model.entity;

public class State {

    private static State state;
    private final String stateName;
    private Region region;
    private City city;

    private State() {
        this.stateName = "Казахстан";
        this.region = new Region();
        this.city = new City();
    }

    public static State getState() {
        if (state == null) {
            state = new State();
        }
        return state;
    }

    public String getStateName() {
        return stateName;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Гражданство: " + stateName
                + ", место жительства: " + region.getRegionName()
                + ", " + city.getCityName()
                + ".";
    }
}
