package kz.kopanitsa.task.University.model;

public class Student implements StudentInterface, UniversityInterface {
    private String name;
    private University university;
    private Teacher teacher;

    public void setStudent(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return this.name;
    }

    public void setTeacher(Teacher name) {
        this.teacher = name;
    }

    public void setStudentUniversity(University name) {
        this.university = name;
    }
    public String getFullStudent() {
        return "Я студент " + this.name + ", мой преподаватель - " +  teacher.getTeacherName() + " в " + university.getUniversity() + ".";
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
