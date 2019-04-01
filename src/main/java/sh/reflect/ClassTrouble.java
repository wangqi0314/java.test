package sh.reflect;

class Cls {
	private Cls() {
	}
}

public class ClassTrouble {
	public static void main(String... args) {
		try {
			Class<?> c = Class.forName("Cls");
			c.newInstance(); // InstantiationException

			// production code should handle these exceptions more gracefully
		} catch (InstantiationException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		}
	}
}