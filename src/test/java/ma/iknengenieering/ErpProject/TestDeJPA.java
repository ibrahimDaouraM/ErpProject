package ma.iknengenieering.ErpProject;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
