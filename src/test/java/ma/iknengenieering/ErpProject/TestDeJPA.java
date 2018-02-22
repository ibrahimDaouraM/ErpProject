package ma.iknengenieering.ErpProject;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.iknengenieering.ErpProject.dao.ClientRepository;
import ma.iknengenieering.ErpProject.entities.Client;
import ma.iknengenieering.ErpProject.metier.AdminMetier;

public class TestDeJPA {

	@Test
	public void test1() {
		try {
			ClassPathXmlApplicationContext application=
					new ClassPathXmlApplicationContext( new String[] {"applicationContext.xml"});
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(),true);
		}
		
	}
}
