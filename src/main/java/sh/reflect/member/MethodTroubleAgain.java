package sh.reflect.member;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class AnotherClass {
	private void m() {
		System.out.println("m...");
	}
}

public class MethodTroubleAgain {
	public static void main(String... args) {
		AnotherClass ac = new AnotherClass();
		try {
			Class<?> c = ac.getClass();
			Method m = c.getDeclaredMethod("m");
//  	    m.setAccessible(true);      // solution
			Object o = m.invoke(ac); // IllegalAccessException

			// production code should handle these exceptions more gracefully
		} catch (NoSuchMethodException x) {
			x.printStackTrace();
		} catch (InvocationTargetException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		}
	}
}
