package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Course;
import util.HibernateUtil;

public class CourseDao {
	public void saveCourse(Course course) {
		System.out.println("Save method is called");
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(course);
			transaction.commit();
		}catch(Exception e)
		{
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		
	}
}
