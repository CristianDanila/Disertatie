package org.pdev.pm;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.pdev.entity.AccountDetail;
import org.pdev.entity.Role;
import org.pdev.entity.User;

public class PersistenceManager {

public static void main(String[] args) throws ParseException {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("APP-PDEV-REPO");
	   	EntityManager entitymanager = emfactory.createEntityManager( );
	   	entitymanager.getTransaction( ).begin( );
	   	
	   	Role role = new Role();
	   	role.setRoleTitle("roleTitle");
	   	
	   	System.out.println("Role: "+role.getRoleTitle());
	  
	   	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   	Date currentDate = new Date();
	   	System.out.println(dateFormat.format(currentDate)); 
	   	
	   	AccountDetail acc = new AccountDetail();
		acc.setAddress("adresa");
		acc.setName("Nume");
		acc.setPhoneNr("074444");
		acc.setSurname("nume pren");
		acc.setRegisteredDate(currentDate);
		acc.setBirthDay(currentDate);
		
		
		User user = new User();
		user.setUserName("username");
		user.setUserEmail("email");
		user.setUserPassword("password");
		user.setRoleId(role);
		user.setAccountId(acc);
		acc.setUser(user);

		entitymanager.persist(user);	
		entitymanager.persist(role);
		entitymanager.persist(acc);

		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();	   
	}
}