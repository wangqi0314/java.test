package sh.spring.aop.proxy;

public class Main {

	public static void main(String[] args) {
		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(
				target).getLoggingProxy();
		int result = proxy.add(2, 3);
		System.out.println(result);
		System.out.println(target.add(3, 5));

	}

}
