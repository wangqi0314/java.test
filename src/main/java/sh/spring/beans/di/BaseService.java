package sh.spring.beans.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	@Autowired
	protected BaseRepository<T> repository;

	public void add() {
		System.out.println("baseService add.........");
		System.out.println("baseService add :" + repository);
	}
}
