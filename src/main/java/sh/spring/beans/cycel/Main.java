package sh.spring.beans.cycel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext(
				"beans-cycel.xml");

		Car car = (Car) c1.getBean("car");
		System.out.println(car);

		c1.close();

	}

}
