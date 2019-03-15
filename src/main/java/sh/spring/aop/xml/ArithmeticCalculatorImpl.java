package sh.spring.aop.xml;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	@Override
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override
	public int div(int a, int b) {
		int result = a / b;
		return result;
	}

}
