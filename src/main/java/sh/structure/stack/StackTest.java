package sh.structure.stack;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Test;

public class StackTest {

	void showpush(Stack<Number> st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}

	void showpop(Stack<Number> st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	@Test
	public void Test() {
		Stack<Number> st = new Stack<Number>();
		System.out.println("stack: " + st);
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		showpop(st);
		showpop(st);
		showpop(st);
		try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}
}
