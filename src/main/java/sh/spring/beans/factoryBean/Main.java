package sh.spring.beans.factoryBean;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {

		ApplicationContext act = new ClassPathXmlApplicationContext(
				"beans-factoryBean.xml");

		Car car = (Car) act.getBean("car1");
		System.out.println(car);
		
	}

}
