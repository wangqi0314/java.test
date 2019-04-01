package sh.reflect.member;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import static java.lang.System.out;

public class MethodSpy {
	private static final String fmt = "%24s: %s%n";

	// for the morbidly curious
	<E extends RuntimeException> void genericThrow() throws E {
	}

	public static void main(String... args) {
		try {
			Class<?> c = Class.forName(args[0]);
			System.out.println(c);
			Method[] allMethods = c.getDeclaredMethods(); // =================
			System.out.println(allMethods);
			for (Method m : allMethods) {
				System.out.println(m.getName());
				if (!m.getName().equals(args[1])) {
					continue;
				}
				out.format("%s%n%n", m.toGenericString());

				out.format(fmt, "ReturnType", m.getReturnType());
				out.format(fmt, "GenericReturnType", m.getGenericReturnType());

				Class<?>[] pType = m.getParameterTypes();
				Type[] gpType = m.getGenericParameterTypes();
				for (int i = 0; i < pType.length; i++) {
					out.format(fmt, "ParameterType", pType[i]);
					out.format(fmt, "GenericParameterType", gpType[i]);
				}

				Class<?>[] xType = m.getExceptionTypes();
				Type[] gxType = m.getGenericExceptionTypes();
				for (int i = 0; i < xType.length; i++) {
					out.format(fmt, "ExceptionType", xType[i]);
					out.format(fmt, "GenericExceptionType", gxType[i]);
				}

				Parameter[] p = m.getParameters();
				for(int i =0;i < p.length;i++) {
					System.out.println(p[i].getName());
					System.out.println(p[i].getType());
					System.out.println(p[i].getClass());
				}
			}

			// production code should handle these exceptions more gracefully
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		}
	}
}