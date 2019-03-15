package sh.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorLoggingProxy {
	// Ҫ����Ķ���
	private ArithmeticCalculator target;

	/**
	 * @param target
	 */
	public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
		super();
		this.target = target;
	}

	public ArithmeticCalculator getLoggingProxy() {
		ArithmeticCalculator proxy = null;

		// �����������һ���������������
		ClassLoader loader = target.getClass().getClassLoader();
		// �����������ͣ�����������Щ������
		Class[] interfaces = new Class[] { ArithmeticCalculator.class };
		InvocationHandler h = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {

				String met = method.getName();
				System.out.println("This Mehod :" + met + "; This Pro"
						+ Arrays.asList(args));

				Object result = null;
				try {
					// ǰ��
					result = method.invoke(target, args);
					// ����
				} catch (Exception e) {
					e.getStackTrace();
					// �쳣
				}
				// ����
				System.out.println("This Mehod :" + met + "; This result"
						+ result);
				return result;
			}
		};
		proxy = (ArithmeticCalculator) Proxy.newProxyInstance(loader,
				interfaces, h);
		return proxy;
	}
}
