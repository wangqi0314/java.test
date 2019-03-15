package sh.spring.beans.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sh.spring.beans.annotation.service.UserService;

@Controller
public class UserController {
	@Autowired(required = false)  //限定是否 必须 预先设计 userService 的Beans;
	@Qualifier("userService")    //指定使用哪一个 Beans；
	private UserService userService;

	public UserController() {
		// TODO 自动生成的构造函数存根
	}

	public void execute() {
		System.out.println("userController execute............");
		userService.add();
	}

}
