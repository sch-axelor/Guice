package guice2;

import java.util.List;

import  javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PhoneListImpl implements PhoneList {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SAHIL2");

    @Override
    public void listPhones() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
        	 Query query = entityManager.createQuery("SELECT p FROM Phone p");
            List<Phone> phones = query.getResultList();
            for (Phone phone : phones) {
                System.out.println("Phone ID: " + phone.getId() + ", Brand Name: " + phone.getBrandName());
            }
        } finally {
            entityManager.close();
        }
    }
}
	
	


