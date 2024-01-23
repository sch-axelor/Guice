package guice2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;


public class listofstudentImp implements StudentList {
	
	private Student student;
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SAHIL2");
	
	EntityManager entitymanager = entityManagerFactory.createEntityManager();
	

	@Override
	public void listofstudent() { 
//		Query query = entitymanager.createQuery("Select s from Student s");
		
//		List<Student>list=query.getResultList();
//		for(Student s:list) {
//			System.out.println(s.setStidId(1));
//			System.out.println(s.setStudName("Sahil"));
			
		
		
		// TODO Auto-generated method stub
		
	}
	

	
	

}
