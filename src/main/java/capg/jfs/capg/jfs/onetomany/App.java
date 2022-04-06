package capg.jfs.capg.jfs.onetomany;

import dao.CourseDao;
import dao.InstructorDao;
import entity.Course;
import entity.Instructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        InstructorDao instructorDao =  new InstructorDao();
        CourseDao courseDao = new CourseDao();
        Instructor instructor = new Instructor("Venkat","S","12venkat@gmail.com");
        instructorDao.saveInstructor(instructor);
        
        Course course1=new Course("Java Programming");
        course1.setInstructor(instructor);
        courseDao.saveCourse(course1);
        
        Course course2=new Course("Springboot");
        course2.setInstructor(instructor);
        courseDao.saveCourse(course2);
    }
}
