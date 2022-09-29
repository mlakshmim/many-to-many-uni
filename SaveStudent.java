package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {

	public static void main(String[] args) {
        Student sutdent=new Student();
        sutdent.setName("Lakshmi");
        sutdent.setEmail("LM@gmail.com");
        
        Student s1=new Student();
        s1.setName("Vinay");
        s1.setEmail("VM@gmail.com");
//        
        Course c=new Course();
        c.setId(1);
        c.setName("Java");
        c.setCost(30000);
        
        Course c1=new Course();
        c1.setId(2);
        c1.setName("React");
        c1.setCost(3000);
        
        Course c2=new Course();
        c2.setId(3); 
        c2.setName("Hibernate");
        c2.setCost(300);
        
        List<Course> l=new ArrayList();
        l.add(c);
        l.add(c1);
        l.add(c2);
        
        List<Course> l2=new ArrayList();
        l2.add(c);
        l2.add(c1); 
        
        sutdent.setCourse(l);
        s1.setCourse(l2);
        
        
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        
        entityTransaction.begin();
        entityManager.persist(sutdent);
        entityManager.persist(s1);
        entityManager.persist(c);
        entityManager.persist(c1);
        entityManager.persist(c2);
        entityTransaction.commit();
	}

}
