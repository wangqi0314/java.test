package sh.basic;

import org.junit.Test;

public class NumberTest {

	/**
	 * 装箱，拆箱测试
	 */
	@Test
	public void testBox() {
		Integer x = 5; // boxes int to an Integer object
		x = x + 10; // unboxes the Integer to a int
		System.out.println(x);
	}

	/**
	 * Math基本测试
	 */
	@Test
	public void testMath() {
		System.out.println("90 度的正弦值：" + Math.sin(Math.PI / 2));
		System.out.println("0度的余弦值：" + Math.cos(0));
		System.out.println("60度的正切值：" + Math.tan(Math.PI / 3));
		System.out.println("1的反正切值： " + Math.atan(1));
		System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI / 2));
		System.out.println(Math.PI);
		System.out.println(Math.round(230.55));
	}
}
