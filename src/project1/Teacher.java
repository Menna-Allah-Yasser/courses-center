
package project1;

import java.util.ArrayList;


public class Teacher {
     private int id;
    private String teacherName;
    private ArrayList<Course> list = new ArrayList();

    public Teacher() {
    }

    public Teacher(int id, String teacherName, Course course) {
        this.id = id;
        this.teacherName = teacherName;
        list.add(course);
        course.setTeacher(this);
    }

    public Teacher(int id, String teacherName, ArrayList<Course> list) {
        this.id = id;
        this.teacherName = teacherName;
        this.list = list;
        Course c = new Course();
        for (int i = 0; i < list.size(); i++) {
            c = list.get(i);
            c.setTeacher(this);
         
        }
    }

    public void setCourseOfTeacher(Course course) {
        list.add(course);
    }

    public void getCourses() {
        try {
            if (!list.isEmpty()) {
                Course c = new Course();
                System.out.println("           ID    Name");
                for (int i = 0; i < list.size(); i++) {
                    c = list.get(i);
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

    public int getId() {
        //   System.out.print("ID of Teacher is : " );
        return id;
    }

    public String getTeacherName() {
        //  System.out.print("Name of Teacher is : ");
        return teacherName;
    }
}
