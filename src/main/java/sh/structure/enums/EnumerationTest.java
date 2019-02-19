package sh.structure.enums;

import java.util.Enumeration;
import java.util.Vector;

import org.junit.Test;

public class EnumerationTest {

	@Test
	public void test() {

		Vector<String> dayNames = new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		Enumeration<String> days = dayNames.elements();
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}
}
