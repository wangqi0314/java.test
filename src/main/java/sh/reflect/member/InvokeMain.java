package sh.reflect.member;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class InvokeMain {
	public static void main(String... args) {
		try {
			Class<?> c = Class.forName(args[0]);
			Class[] argTypes = new Class[] { String[].class };
			Method main = c.getDeclaredMethod("main", argTypes);

			System.out.println("function  " + main);

			String[] mainArgs = Arrays.copyOfRange(args, 1, args.length);

			if (mainArgs.length > 0) {
				System.out.println(Arrays.toString(mainArgs));

				System.out.format("invoking %s.main()%n", c.getName());
				main.invoke(null, (Object) mainArgs);

			}

			// production code should handle these exceptions more gracefully
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (NoSuchMethodException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		} catch (InvocationTargetException x) {
			x.printStackTrace();
		}
	}
}
