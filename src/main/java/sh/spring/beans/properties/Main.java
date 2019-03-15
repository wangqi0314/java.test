package sh.spring.beans.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		// 
		@SuppressWarnings("resource")
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-properties.xml");
		DataSource dataSource = (DataSource) act.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}

}
