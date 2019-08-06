package sh.spring.aop.xml;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	public int div(int a, int b) {
		int result = a / b;
		return result;
	}

}
