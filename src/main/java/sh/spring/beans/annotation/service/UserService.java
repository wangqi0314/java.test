package sh.spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sh.spring.beans.annotation.repository.UserRepositor;

@Service
public class UserService {
	@Autowired
	private UserRepositor userRepositor;

	public UserService() {
		// TODO 自动生成的构造函数存根
	}

	public void add() {
		System.out.println("userService Add...........");
		userRepositor.save();
	}
}
