
package project1;

import java.util.ArrayList;


public class Course {
    private String code;
    private String name;
    private Teacher teacher = new Teacher();
    private ArrayList<Student> list = new ArrayList();

    public void addStudentToCourse(Student student) {
        list.add(student);
    }

    public void showStudentsOfCourse() {
        try {
            if (!list.isEmpty()) {
                System.out.println("Students who registered in this Course : ");
                System.out.println("Id          Name");
                Student s = new Student();
                for (int i = 0; i < list.size(); i++) {
                    s = list.get(i);
                    System.out.println(s.getId() + "          " + s.getName());
                }
            }
        } catch (Exception ex) {
            System.out.println("EX");
        }
    }

    public Course() {
    }

    Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    Course(String code, String name, Teacher teacher) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.teacher.setCourseOfTeacher(this);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        //System.out.println("Name of course is : " );
        return name;
    }

    public String getCode() {
        // System.out.println("Code of course is : " );
        return code;
    }

    public void getTeacherOfCourse() {
        System.out.println("Name of Teacher is : " + teacher.getTeacherName());
    }
}
