package sh.spring.beans.cycel;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO �Զ����ɵķ������
		System.out.println("Before: " + bean + "-" + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO �Զ����ɵķ������
		System.out.println("After: " + bean + "-" + beanName);
		Car car1=new Car();
		car1.setBrand("BenChi");
		return car1;
	}

}
