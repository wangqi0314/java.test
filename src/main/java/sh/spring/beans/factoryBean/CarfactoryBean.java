package sh.spring.beans.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class CarfactoryBean implements FactoryBean<Car> {

	public CarfactoryBean() {
	}

	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Car getObject() throws Exception {

		return new Car(brand, 23400, 230.89);
	}

	public Class<?> getObjectType() {
		return Car.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
