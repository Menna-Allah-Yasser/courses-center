package project1;

import java.util.ArrayList;

public class Teacher {

    private int id;
    private String teacherName;
    private ArrayList<Course> teacherCourses = new ArrayList();

    //Constractors
    public Teacher() {
    }

    public Teacher(int id, String teacherName, Course course) {
        this.id = id;
        this.teacherName = teacherName;
        teacherCourses.add(course);
        course.setTeacher(this);
    }

    public Teacher(int id, String teacherName, ArrayList<Course> listOfCourses) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherCourses = listOfCourses;
        Course c = new Course();
        for (int i = 0; i < listOfCourses.size(); i++) {
            c = listOfCourses.get(i);
            c.setTeacher(this);

        }
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setCourseOfTeacher(Course course) {
        teacherCourses.add(course);
        course.setTeacher(this);
    }

    //getter
    public int getId() {
        //   System.out.print("ID of Teacher is : " );
        return id;
    }

    public String getTeacherName() {
        //  System.out.print("Name of Teacher is : ");
        return teacherName;
    }

    public void getCourses() {
        try {
            if (!teacherCourses.isEmpty()) {
                Course c = new Course();
                System.out.println("           ID    Name");
                for (int i = 0; i < teacherCourses.size(); i++) {
                    c = teacherCourses.get(i);
                    System.out.println("Course #" + ++i + " : " + c.getCode() + "      " + c.getName());
                    i--;

                }
                System.out.println();
            } else {
                System.out.println("There is no Courses ");
            }
        } catch (NullPointerException ex) {
            System.out.println("Exception ");
        }
    }

}
