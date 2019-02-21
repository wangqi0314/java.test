package sh.generic;

import org.junit.Test;

public class GenericMethodTest {

	// 泛型方法 printArray
	public <E> void printArray(E[] inputArray) {
		// 输出数组元素
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	@Test
	public void Test() {
		// 创建不同类型数组： Integer, Double 和 Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray); // 传递一个整型数组

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray); // 传递一个双精度型数组

		System.out.println("\nArray characterArray contains:");
		printArray(charArray); // 传递一个字符型型数组
	}

	// 比较三个值并返回最大值
	public <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // 假设x是初始最大值
		if (y.compareTo(max) > 0) {
			max = y; //y 更大
		}
		if (z.compareTo(max) > 0) {
			max = z; // 现在 z 更大           
		}
		return max; // 返回最大对象
	}

	@Test
	public void Test2() {
		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));

		System.out.printf("Maxm of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

		System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
				maximum("pear", "apple", "orange"));
	}
}
