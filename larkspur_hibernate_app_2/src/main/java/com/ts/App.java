package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
				   .addAnnotatedClass(Employee.class);

		SessionFactory sf =  cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		//-----------------
		
		Employee employee1 = new Employee();
		employee1.setName("Aliya");
		employee1.setCity("Pune");
		employee1.setDepartment("ADMIN");
		employee1.setMobile(787878);
		
		
		session.persist(employee1);
		
		//-----------------
		session.getTransaction().commit();
		session.close();
		

    }
}
