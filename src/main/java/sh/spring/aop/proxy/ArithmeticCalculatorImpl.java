package sh.spring.aop.proxy;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

}
