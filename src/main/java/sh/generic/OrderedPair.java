/**
 * 
 */
package sh.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qi.wang
 *
 */
public class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		//
		return key;
	}

	@Override
	public V getValue() {
		//
		return value;
	}

	public static int sumEven(List<Integer> li) {
		int sum = 0;
		for (Integer i : li)
			if (i % 2 == 0)
				sum += i;
		return sum;
	}

	public static void main(String... args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(new Integer(2));
		l.add(new Integer(2));
		l.add(new Integer(2));
		System.out.println(sumEven(l));
	}

}
