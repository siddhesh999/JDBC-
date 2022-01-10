package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {// main class to add players
	public static void main(String[] args) {
		Team player1 = new Team();
		player1.setId(07);
		player1.setName("MS dhoni");
		player1.setDesignetion("capt");
		player1.setSalary(150);

		Team player2 = new Team();
		player2.setId(0);
		player2.setName("virat kohali");
		player2.setDesignetion("vice-capt");
		player2.setSalary(500);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("player");

		EntityManager createEntityManager = emf.createEntityManager();

		EntityTransaction transaction = createEntityManager.getTransaction();

		transaction.begin();
		createEntityManager.persist(player1);
		createEntityManager.persist(player2);
		transaction.commit();

	}
}



