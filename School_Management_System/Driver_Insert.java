package School_Management_System;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver_Insert 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pavan");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		School sc = new School();
		sc.setSc_id(2);
		sc.setSc_name("Sri Chaitanya School");
		sc.setSc_address("Koramangala");
		
		Principal p = new Principal();
		p.setP_id(13);
		p.setP_name("Raju");
		
		sc.setPrincipal(p);
		
		Students st1 = new Students();
		st1.setSt_id(113);
		st1.setSt_name("Madhu");
		st1.setSt_class("12th");
		st1.setSchool(sc);
		
		Students st2 = new Students();
		st2.setSt_id(114);
		st2.setSt_name("Dasarath");
		st2.setSt_class("11th");
		st2.setSchool(sc);
		
		List<Students> l1 = new ArrayList<Students>();
		l1.add(st1);
		l1.add(st2);
		
		sc.setStudents(l1);
		
		Teachers t1 = new Teachers();
		t1.setT_id(1113);
		t1.setT_name("Raveesh");
		t1.setSchool(sc);
		
		Teachers t2 = new Teachers();
		t2.setT_id(1114);
		t2.setT_name("Narien");
		t2.setSchool(sc);
		
		List<Teachers> l2 = new ArrayList<Teachers>();
		l2.add(t1);
		l2.add(t2);
		
		sc.setTeachers(l2);
		
		et.begin();
		em.persist(sc);
		em.persist(p);
		em.persist(st1);
		em.persist(st1);
		em.persist(t1);
		em.persist(t2);
		et.commit();
		System.out.println("Data Saved Successfully");
 	}
}
