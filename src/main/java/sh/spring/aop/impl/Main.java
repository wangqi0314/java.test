package sh.spring.aop.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ArithmeticCalculator Ari = (ArithmeticCalculator) act
				.getBean(ArithmeticCalculator.class);

		int result = Ari.add(4, 5);
		System.out.println(result);

		int result2 = Ari.div(4, 1);
		System.out.println(result2);

	}

}
