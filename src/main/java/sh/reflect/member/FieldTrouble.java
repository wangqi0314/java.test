package sh.reflect.member;

import java.lang.reflect.Field;

public class FieldTrouble {
	public Integer val;

	public static void main(String... args) {
		FieldTrouble ft = new FieldTrouble();
		try {
			Class<?> c = ft.getClass();
			Field f = c.getDeclaredField("val");
			f.setInt(ft, 42); // IllegalArgumentException
//			f.set(ft, new Integer(42));  //此法可以避免 IllegalArgumentException 异常

			// production code should handle these exceptions more gracefully
		} catch (NoSuchFieldException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		}
	}
}