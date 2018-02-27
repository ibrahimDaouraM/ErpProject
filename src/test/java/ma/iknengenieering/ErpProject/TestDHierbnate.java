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
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
		
	}
}
