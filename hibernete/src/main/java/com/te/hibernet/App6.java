package com.te.hibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



import com.mysql.cj.Query;
public class App6 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("players");
		EntityManager em = emf.createEntityManager();
		
		
		String query1 ="Select min(salary )from TeamIndia";
		Query createQuery2= (Query) em.createQuery(query1);
		Double singleResult= (Double)((javax.persistence.Query) createQuery2).getSingleResult();
		System.out.println(singleResult);
		
		EntityTansaction transaction = createEntityManager.getTransaction();
		
		String query2 = "update TeamIndia set  salary = 150 where id = 12 ";
		transaction.begin();
		
		Query createQuery = createEntityManager.createQuery(query2);
		Sring query2= "update teamindia set salary = 150  where id =12";
		transaction. 
		
		
		
		
		

		
		
		
	

	}

}
