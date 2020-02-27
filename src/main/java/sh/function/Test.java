package sh.function;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class Test {

	public static Function<Integer, Integer> mapper = (p) -> {

		return p;

	};

	public BiConsumer<Integer, Integer> send() {

		return (p, q) -> {
			int i = p.intValue();
			int n = q.intValue();
			System.out.println(i + n);
		};
	}

	public void funTest() {

		int result = mapper.apply(123);
		System.out.println(result);

		send().accept(new Integer(2), new Integer(4));
	}

	public static void main(String[] args) {
		new Test().funTest();
	}

}
