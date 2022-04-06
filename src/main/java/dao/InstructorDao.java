package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Instructor;
import util.HibernateUtil;

public class InstructorDao {
	public void saveInstructor(Instructor instructor) {
		System.out.println("Save method is called");
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(instructor);
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
