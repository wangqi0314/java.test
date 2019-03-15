package sh.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext(
				"applicationContext-xml.xml");
		ArithmeticCalculator Ari = (ArithmeticCalculator) act
				.getBean(ArithmeticCalculator.class);

		int result = Ari.add(4, 5);
		System.out.println(result);

		int result2 = Ari.div(4, 0);
		System.out.println(result2);

	}

}
