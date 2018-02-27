package ma.iknengenieering.ErpProject;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.iknengenieering.ErpProject.entities.Client;
import ma.iknengenieering.ErpProject.metier.IUtilisateurMetier;



public class TestDHierbnate{

	/**
	 * 
	 */
	@Test
	public void test2() {
		try {
			ClassPathXmlApplicationContext app=
					new ClassPathXmlApplicationContext( new String[] {"applicationContext.xml"});
			IUtilisateurMetier clientMetier=(IUtilisateurMetier) app.getBean("metier");
			
			clientMetier.ajouterClient(new Client("bb","rabat","ibrs@gmqil.com",23884));
			clientMetier.ajouterClient(new Client("ibrah","Casablanca","ibrs@gmqil.com",3994939));
			clientMetier.ajouterClient(new Client("ibrahjim","Casablanca","ibrs@gmqil.com",3994939));
			clientMetier.ajouterClient(new Client("ibrah","Casablanca","ibrs@gmqil.com",3994939));
			
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
		
	}
}
