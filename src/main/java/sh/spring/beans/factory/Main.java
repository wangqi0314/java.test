package sh.spring.beans.factory;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext act = new ClassPathXmlApplicationContext(
				"beans-factory.xml");

		Car car = (Car) act.getBean("car1");
		System.out.println(car);
		
		Car car2 = (Car) act.getBean("car2");
		System.out.println(car2);
	}

}
