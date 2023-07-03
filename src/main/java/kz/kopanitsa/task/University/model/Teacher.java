package kz.kopanitsa.task.University.model;

public class Teacher implements TeacherInterface, UniversityInterface {
    private String name;
    private University university;
    private Student student;

    public void setTeacher(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return this.name;
    }

    public void setTeacherStudent(Student name) {
        this.student = name;
    }

    public void setTeacherUniversity(University name) {
        this.university = name;
    }

    public String getFullTeacher() {
        return "Я преподаватель " + this.name + " я обучаю студента " + student.getStudentName() + " в " + university.getUniversity() + ".";
    }
    @Override
    public String talkLesson() {
        return "Я рассказываю лекцию.";
    }

    @Override
    public String takeExam() {
        return "Я принимаю экзамен у студентов.";
    }

    @Override
    public String eat() {
        return "Я как преподаватель часто обедаю в университетской столовой. ";
    }
}
