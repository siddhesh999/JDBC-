package com.te.hibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

public class App5 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("players");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		em.find(Team.class, em);
		transaction.begin();
		em.remove(vk);
		transaction.commit();
		
		
		Team kl = em.find(Team.class, 1);
		if (kl!=null) {
			kl.setDesignetion("vc");
			transaction.begin();
			transaction.commit();
			System.out.println("update");
			
		}
		
		
		
		
	}
}
