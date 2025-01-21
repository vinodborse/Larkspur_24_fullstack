package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
    										   .addAnnotatedClass(Student.class)
    										   .addAnnotatedClass(Teacher.class);
    	
    	SessionFactory sf =  cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	//-----------------
    	
    	// INSERT INTO student VALUE (1, 'Vinod', 'Pune');
    	
    	/*
    	Student std = new Student();
    	std.setRollno(3);
    	std.setName("Don");
    	std.setAddress("Mumbai");
    	
    	
//    	session.save(std);
    	session.persist(std);
    	*/
    	
//    	SELECT * FROM student WHERE rollno = 2;
    	//Student s = session.get(Student.class, 3);
    	//System.out.println("Student name is :- "+ s.getName());
    	
    	// UPDATE ...........
    	//Student s1 = session.get(Student.class, 2);
    	//s1.setName("Vinod");
    	
    	// DELETE ......
    	Student s2 = session.get(Student.class, 3);
    	//session.delete(s2);
    	session.remove(s2);
    	
    	//-----------------
    	session.getTransaction().commit();
    	session.close();
    	
    	
    }
}
