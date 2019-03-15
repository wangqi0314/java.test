package sh.spring.beans.autowrite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-autowrite.xml");
		Person per = (Person) act.getBean("person1");
		System.out.println(per);
	}

}
