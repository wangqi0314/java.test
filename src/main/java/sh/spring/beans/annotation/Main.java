package sh.spring.beans.annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import sh.spring.beans.annotation.controller.UserController;
import sh.spring.beans.annotation.repository.UserRepositor;
//import sh.spring.beans.annotation.repository.UserRepositorImpl;
//import sh.spring.beans.annotation.service.UserService;

public class Main {

	public static void main(String[] args) throws SQLException {

		ApplicationContext act = new ClassPathXmlApplicationContext("beans-annotation.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");

		// TestObject object1 = (TestObject) act.getBean("testObject");
		// System.out.println(object1);

		// UserController con1 = (UserController) act.getBean("userController");
		// con1.execute();
		// System.out.println(con1);

		UserRepositor user1 = (UserRepositor) act.getBean("userRepositor1");
		user1.save();
		System.out.println(user1);
		//
		// UserService userser1 = (UserService) act.getBean("userService");
		// userser1.add();
		// System.out.println(userser1);
		
	}

}
