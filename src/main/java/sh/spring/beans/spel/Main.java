package sh.spring.beans.spel;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO �Զ����ɵķ������
		ApplicationContext act = new ClassPathXmlApplicationContext(
				"beans-spel.xml");		
		
		Address address = (Address) act.getBean("address");
		System.out.println(address);

		Car car = (Car) act.getBean("car");
		System.out.println(car);
		
		Person per =(Person)act.getBean("person");
		System.out.println(per);
	}

}
