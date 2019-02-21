package sh.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class genericTest {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("123");
		c.add("456");
		c.add("789");
		 printCollection1(c);

		Collection<Object> c2 = new ArrayList<Object>();
		c2.add(123);
		c2.add(123);
		c2.add(123);
		 printCollection2(c2);

		String[] s1 = new String[] { "1", "3", "9" };
		Collection<String> c3 = new ArrayList<String>();
		fromArrayToCollection(s1, c3);
		System.out.println(c3);

		String[] str = new String[5];
		for (String myStr : str) {
			myStr = "atguigu";
			System.out.println(myStr);
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

	static void printCollection1(Collection<?> c) {
		Iterator<?> i = c.iterator();
		for (int k = 0; k < c.size(); k++) {
			System.out.println(i.next());
		}
	}

	static void printCollection2(Collection<Object> c) {
		for (Object e : c) {
			System.out.println(e);
		}
	}

	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o);
		}
	}

}
