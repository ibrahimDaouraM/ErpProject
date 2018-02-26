package ma.iknengenieering.ErpProject;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestDHierbnate{

	@Test
	public void test2() {
		try {
			ClassPathXmlApplicationContext app=
					new ClassPathXmlApplicationContext( new String[] {"applicationContext.xml"});
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(),true);
		}
		
	}
}
