package sh.spring.beans.di;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO 自动生成的方法存根
		@SuppressWarnings("resource")
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-di.xml");

		UserService con1 = (UserService) act.getBean("userService");
		con1.add();
		//		System.out.println(con1);
	}

}
