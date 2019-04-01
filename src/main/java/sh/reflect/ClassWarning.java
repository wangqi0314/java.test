package sh.reflect;

import java.lang.reflect.Method;

public class ClassWarning {
	static void m() {
		try {

//			Class<? extends ClassWarning> c = new ClassWarning().getClass();

			Class c = ClassWarning.class;
			Method m = c.getMethod("m"); // warning

			// production code should handle this exception more gracefully
		} catch (NoSuchMethodException x) {
			x.printStackTrace();
		}
	}

	public static void main(String... args) {
//		m();
	}
}
