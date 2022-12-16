package project1;

import java.util.ArrayList;

public class Course {

    private String code;
    private String name;
    private Teacher teacher = new Teacher();
    private ArrayList<Student> StudentsOfCourse = new ArrayList();

    //Constractors
    
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

    // setter
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudentToCourse(Student student) {
        StudentsOfCourse.add(student);
    }

    //Getter
    public String getCode() {
        // System.out.println("Code of course is : " );
        return code;
    }

    public String getName() {
        //System.out.println("Name of course is : " );
        return name;
    }

    public void getTeacherOfCourse() {
        System.out.println("Teacher Name is : " + teacher.getTeacherName());
    }

    public void showStudentsOfCourse() {
        try {
            if (!StudentsOfCourse.isEmpty()) {
                System.out.println("Students who registered in this Course : ");
                System.out.println("Id          Name");
                Student s = new Student();
                // loop to print arrayList of students
                for (int i = 0; i < StudentsOfCourse.size(); i++) {
                    s = StudentsOfCourse.get(i);
                    System.out.println(s.getId() + "          " + s.getName());
                }
               
            }
        } catch (Exception ex) {
            System.out.println("EX");
        }
    }

}
