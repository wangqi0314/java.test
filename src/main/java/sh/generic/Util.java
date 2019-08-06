package sh.generic;

public class Util {

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}

	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}

	public static void main(String... args) {
		Pair<Integer, String> p1 = new OrderedPair<Integer, String>(1, "apple");
		Pair<Integer, String> p2 = new OrderedPair<Integer, String>(2, "pear");
		boolean same = Util.<Integer, String>compare(p1, p2);
		System.out.println(same);

		Pair<Integer, Integer> p3 = new OrderedPair<Integer, Integer>(1, 1);
		Pair<Integer, Integer> p4 = new OrderedPair<Integer, Integer>(1, 1);
		boolean same2 = Util.compare(p3, p4);
		System.out.println(same2);
	}
}
