package sh.spring.beans.di;

import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {

	public void add() {
		super.add();
		System.out.println("UserService add.........");
		System.out.println("UserService add :" + repository);
	}
}
