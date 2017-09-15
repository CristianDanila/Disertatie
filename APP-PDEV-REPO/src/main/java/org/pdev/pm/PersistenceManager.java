package org.pdev.pm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.pdev.entity.Role;
import org.pdev.entity.User;

public class PersistenceManager {

public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("APP-PDEV-REPO");
	   	EntityManager entitymanager = emfactory.createEntityManager( );
	   	entitymanager.getTransaction( ).begin( );
	   	
	   	Role role = new Role();
	   	role.setRoleTitle("roleTitle");
	   	
	   	System.out.println("Role: "+role.getRoleTitle());
	   	
		entitymanager.getTransaction( ).commit( );
		entitymanager.getTransaction( ).begin( );
		
		entitymanager.persist(role);
		
		User user = new User();
		user.setUserName("username");
		user.setUserEmail("email");
		user.setUserPassword("password");
		user.setRoleId(role);
		
		entitymanager.persist(user);		
		entitymanager.getTransaction().commit();
		entitymanager.getTransaction().begin();
		
		User user1 =entitymanager.find(User.class, 1);
		System.out.println("User " + user1);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();	   
	}
}