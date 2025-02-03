package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	Student s1 = ac.getBean("st1", Student.class);
    	
    	
    	
    	Student s2 = ac.getBean("st2", Student.class);
    	
    	System.out.println(s1.getName());
    	System.out.println(s2.getName());
    	

    }
}
