package kz.kopanitsa.task.state.model.entity;

import java.util.Random;

public class Citizen {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private State state;
    private static Integer nextCitizenId = 0;

    public Citizen() {
        this.id = nextCitizenId++;
        this.firstName = generateFirstName();
        this.lastName = generateLastName();
        this.age = generateAge();
        this.state = State.getState();
    }

    public Integer getId() {
        return id;
    }

    public String generateFirstName() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random random = new Random();
        int lengthFirstName = random.nextInt(4) + 3;
        String firstName = "";
        for (int i = 0; i < lengthFirstName; i++) {
            Random random1 = new Random();
            int randomLetter = random1.nextInt(letters.length);
            firstName += letters[randomLetter];
        }
        return firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String generateLastName() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random random = new Random();
        int lengthLastName = random.nextInt(5) + 5;
        String lastName = "";
        for (int i = 0; i < lengthLastName; i++) {
            Random random1 = new Random();
            int randomLetter = random1.nextInt(letters.length);
            lastName += letters[randomLetter];

        }
        return lastName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer generateAge() {
        Random random = new Random();
        return random.nextInt(100) + 0;
    }

    public Integer getAge() {
        return age;
    }

    private void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Имя: " + firstName
                + ", Фамилия: " + lastName
                + ", возраст: " + age
                + ", гражданство: " + state.getStateName()
                + ", место жительства: " + state.getRegion().getRegionName() + ", "
                + state.getCity().getCityName() + ".";
    }
}
