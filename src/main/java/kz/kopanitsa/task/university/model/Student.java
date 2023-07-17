package kz.kopanitsa.task.university.model;

public class Student implements StudentInterface, UniversityInterface {
    private String name;
    private University university;
    private Teacher teacher;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTeacher(Teacher name) {
        this.teacher = name;
    }

    public void setStudentUniversity(University name) {
        this.university = name;
    }

    public String getFullStudent() {
        return "Я студент " + this.name + ", мой преподаватель - " +  teacher.getName() + " в " + university.getName() + ".";
    }

    @Override
    public String doHomework() {
        return "Я делаю свою домашнюю работу.";
    }

    @Override
    public String askTeacher() {
        return "Я задаю вопрос учителю.";
    }

    @Override
    public String eat() {
        return "Я как студент часто ем в университетской столовой.";
    }
}
