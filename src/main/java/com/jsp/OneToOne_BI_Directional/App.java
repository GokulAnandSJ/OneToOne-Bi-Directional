package com.jsp.OneToOne_BI_Directional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Person p1 = new Person();
		p1.setPersonId(1);
		p1.setPersonName("Gokul");
		p1.setPersonLocation("Salem");

		Person p2 = new Person();
		p2.setPersonId(2);
		p2.setPersonName("Jack");
		p2.setPersonLocation("Chennai");

		Person p3 = new Person();
		p3.setPersonId(3);
		p3.setPersonName("John");
		p3.setPersonLocation("Banglore");

		Passport pas1 = new Passport();
		pas1.setPassportId(101);
		pas1.setPassportIssuedplace("Tiruchirappali");
		pas1.setPassportNumber(876543456);
		

		Passport pas2 = new Passport();
		pas2.setPassportId(102);
		pas2.setPassportIssuedplace("Coimbatore");
		pas2.setPassportNumber(456789098);
		

		Passport pas3 = new Passport();
		pas3.setPassportId(103);
		pas3.setPassportIssuedplace("Banglore");
		pas3.setPassportNumber(876543567);
		
		pas1.setPer(p1);
		pas2.setPer(p2);
		pas3.setPer(p3);
		
		p1.setPass(pas1);
		p2.setPass(pas2);
		p3.setPass(pas3);

	

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		Transaction trns =ses.beginTransaction();

		ses.save(pas1);
		ses.save(pas2);
		ses.save(pas3);
		ses.save(p1);
		ses.save(p2); 
		ses.save(p3);

		trns.commit();

		ses.close();
	}
}
