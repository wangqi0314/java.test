package sh.spring.aop.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext(
				"applicationContext-xml.xml");

	}

}
