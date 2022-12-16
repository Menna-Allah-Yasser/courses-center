package project1;

import java.util.ArrayList;

public class Student {

    private String id;
    private String name;
    private ArrayList<Course> studentCourses = new ArrayList();
    
    //Constractors

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, ArrayList<Course> listOfCourses) {
        this.id = id;
        this.name = name;
        this.studentCourses = listOfCourses;
        Course c = new Course();
        for (int i = 0; i < listOfCourses.size(); i++) {
            c = listOfCourses.get(i);
            c.addStudentToCourse(this);
        }
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourseToStudent(Course course) {
        studentCourses.add(course);
        course.addStudentToCourse(this);
    }

    public void setCourseToStudent(ArrayList<Course> listOfCourses) {
        Course c = new Course();
       // this.studentCourses.addAll(listOfCourses);
        for (int i = 0; i < listOfCourses.size(); i++) {
            c = listOfCourses.get(i);
            this.studentCourses.add(c);
            c.addStudentToCourse(this);
        }

    }

    //getter
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void getCoursesOfStudent() {
        try {
            if (!studentCourses.isEmpty()) {
                System.out.println("Student with id : " + this.getId()
                        + "  and name : " + this.getName() + " has " + studentCourses.size() + " courses");
                Course c = new Course();
                for (int i = 0; i < studentCourses.size(); i++) {
                    c = studentCourses.get(i);
                    System.out.println("Course #" + ++i + " : " + c.getCode()
                            + "      " + c.getName());
                    i--;
                }
            }
        } catch (Exception ex) {
            System.out.println("ex");
        }
    }

}
