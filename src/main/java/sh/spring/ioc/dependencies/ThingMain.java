package sh.spring.ioc.dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThingMain {

	public static void main(String[] args) {
		// 
		
		@SuppressWarnings({ "unused", "resource" })
		ApplicationContext act = new ClassPathXmlApplicationContext("thing-one.xml");

		//		ThingOne user1 = (ThingOne) act.getBean("beanOne");

		//		System.out.println(user1);
		
	}

}
