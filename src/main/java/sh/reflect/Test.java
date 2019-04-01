package sh.reflect;

import java.util.HashSet;
import java.util.Set;

enum E {
	A, B
}

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(new Object().getClass());

		Class<? extends String> c = "foo".getClass();
		System.out.println(c);

//		Class cc = System.console().getClass();
		System.out.println(System.class);

		System.out.println(E.A.getClass());

		byte[] bytes = new byte[1024];
		System.out.println(bytes.getClass().isArray());

		Set<String> s = new HashSet<String>();
		System.out.println(s.getClass());
		
		try {
			Class ccc = Class.forName("sh.reflect.Test");
			
			System.out.println(ccc);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		System.out.println(Double.TYPE);
		
		System.out.println(Void.TYPE);
		
		System.out.println( javax.swing.JButton.class.getSuperclass());
		
		System.out.println(Character.class.getClasses());
		
		System.out.println(Character.class.getDeclaredClasses());
		
	}

}
