package com.application;

import org.hibernate.Session;

import com.hibernate.HibernateUtil;
import com.pojo.Address;

public class App 
{
    public static void main( String[] args )
    {
    	Address address=new Address("Atlanta","PeachTree","GA",30092);
    	/*address.setAid(101);
    	address.setCity("Atlanta");
    	address.setStreet("peachtree");
    	address.setState("GA");
    	address.setZip(30092);*/
    	
    	System.out.println(address);
       	Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		// session.save
		//int i =(Integer)session.save(address);
		session.save(address);
		
		session.getTransaction().commit();
		session.close();
    }
}
