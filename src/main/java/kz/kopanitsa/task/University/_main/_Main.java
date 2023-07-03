package kz.kopanitsa.task.University._main;

import kz.kopanitsa.task.University.model.Student;
import kz.kopanitsa.task.University.model.Teacher;
import kz.kopanitsa.task.University.model.University;

public class _Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        University university = new University();
        Teacher teacher = new Teacher();
        student1.setStudent("Kopanitsa");
        university.setUniversity("IT Girls");
        teacher.setTeacher("Blinov");
        student1.setTeacher(teacher);
        student1.setStudentUniversity(university);
        teacher.setTeacherUniversity(university);
        teacher.setTeacherStudent(student1);
        System.out.println(student1.getFullStudent());
        System.out.println(teacher.getFullTeacher());
        System.out.println(student1.askTeacher());
        System.out.println(student1.doHomework());
        System.out.println(student1.eat());
        System.out.println(teacher.takeExam());
        System.out.println(teacher.talkLesson());
        System.out.println(teacher.eat());


    }




}
