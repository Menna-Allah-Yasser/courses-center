
package project1;

import java.util.ArrayList;


public class Project1 {

    
    public static void main(String[] args) {
         /*  Teacher t1 = new Teacher(1, "Ahmed");
        t1.getId();
        t1.getTeacherName();
        t1.getCourses();*/
        try {
            Course c1 = new Course("1", "Math1");
            Course c2 = new Course("2", "Math2");
            Course c3 = new Course("3", "Math3");
            Course c4 = new Course("4", "Math4");

            ArrayList<Course> list = new ArrayList();
            list.add(c1);
            list.add(c2);
            list.add(c3);
           // list.add(c4);
          //  Teacher t2 = new Teacher(1, "Ahmed", list);

          //  System.out.println(t2.getId());
          //  System.out.println(t2.getTeacherName());
          //  t2.getCourses();
          //  c3.getTeacherOfCourse();
            Student s1=new Student("11","mna1");
            Student s2=new Student("12","mna2");
            Student s3=new Student("13","mna3");
            Student s4=new Student("14","mna4");
            Student s5=new Student("15","mna5");
            s1.setCourseToStudent(c4);
            s2.setCourseToStudent(c4);
            s3.setCourseToStudent(c4);
            s4.setCourseToStudent(c4);
            s5.setCourseToStudent(c4);
          //  s1.setCourseToStudent(list);
          //  s1.getCoursesOfStudent();
          c4.showStudentsOfCourse();
        } catch (Exception ex) {
            System.out.println("ex");
        }
        //  t2.getCourses();
        /*<Course>v=new Vector<>();
       
       Course c2=new Course("2" ,"math");
       
       Teacher t1=new Teacher(1 , "Ahmed");
       Course c3=new Course("3" , "discrete" , t1);
       v.add(c1);
       v.add(c2);
      // v.add(c3);
       
      // t1.getCourses();
      Teacher t4=new Teacher(4 , "mo" ,v);
     // t4.setCourse(c3);
      Teacher t2=new Teacher(1 , "Ahmed");
      Teacher t3=new Teacher(1 , "Ahmed" , c3);
      
      t1.getCourses();
      
       t2.getId();
      t2.getTeacherName();
      t2.getCourses();
      
       t3.getId();
      t3.getTeacherName();
      t3.getCourses();
      
       t4.getId();
      t4.getTeacherName();
      t4.getCourses();*/
    }
    
}
