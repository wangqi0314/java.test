package sh.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository("userRepositor1")
public class UserRepositorImpl1 implements UserRepositor {

	public UserRepositorImpl1() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void save() {
		// TODO 自动生成的方法存根
		System.out.println("UserRepositorImpl save11.....");
	}
}
