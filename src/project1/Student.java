
package project1;

import java.util.ArrayList;

public class Student {
     private String id;
    private String name;
    private ArrayList<Course> list = new ArrayList();
    
    public Student() {
    }
    
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Student(String id, String name, ArrayList<Course> list) {
        this.id = id;
        this.name = name;
        this.list = list;
        Course c = new Course();
        for (int i = 0; i < list.size(); i++) {
            c = list.get(i);
            c.addStudentToCourse(this);
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public void getCoursesOfStudent() {
        try {
            if (!list.isEmpty()) {
                System.out.println("Student with id : " + this.getId()
                        + "  and name : " + this.getName() + " has " + list.size() + " courses");
                Course c = new Course();
                for (int i = 0; i < list.size(); i++) {
                    c = list.get(i);
                    System.out.println("Course #" + ++i + " : " + c.getCode()
                            + "      " + c.getName());
                    i--;
                }
            }
        } catch (Exception ex) {
            System.out.println("ex");
        }
    }

    public void setCourseToStudent(Course course) {
        list.add(course);
        course.addStudentToCourse(this);
    }

    public void setCourseToStudent(ArrayList<Course> list) {
        Course c = new Course();
        for (int i = 0; i < list.size(); i++) {
            c = list.get(i);
            this.list.add(c);
            c.addStudentToCourse(this);
        }
        
    }
}
