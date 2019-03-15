package sh.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		// HelloWorld hello = new HelloWorld();
		// hello.setName("WQ-001");
		// hello.Hello();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		HelloWorld hello1 = (HelloWorld) applicationContext
				.getBean("helloWorld");
		hello1.Hello();
		hello1.NiHao("WQ-001");

		// Car car1 = (Car) applicationContext.getBean("car1");
		// System.out.println(car1);

		// Car car2 = (Car) applicationContext.getBean("car2");
		// System.out.println(car2);

		// User user1 = (User) applicationContext.getBean("user1");
		// System.out.println(user1);

		// DataSource dataSource = (DataSource) applicationContext
		// .getBean("dataSource");
		// System.out.println(dataSource);

		// User user2 = (User) applicationContext.getBean("user2");
		// System.out.println(user2);

		// User user3 = (User) applicationContext.getBean("user3");
		// System.out.println(user3);

		// applicationContext.notifyAll();
	}
}
