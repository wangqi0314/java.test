package sh.generic;

public class Box<T> {

	private T t;

	public void add(T t) {
		this.t = t;
	}

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}

	public static void main(String[] args) {

		Box<Integer> integerBox2 = new Box<Integer>();
		integerBox2.set(new Integer(10));
		integerBox2.inspect(1); // error: this is still String!

		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();

		integerBox.add(new Integer(10));
		integerBox.add(11);
		stringBox.add(new String("Hello World"));

		System.out.printf("Integer Value :%d\n\n", integerBox.get());
		System.out.printf("String Value :%s\n", stringBox.get());

		Box b = new Box();
		b.add(3);
		System.out.println(b.get());

		Box bb = integerBox;
		bb.add("123");
		integerBox = b;

		Box<Integer> bi;
		bi = createBox();

	}

	public static Box createBox() {
		return new Box();
	}
}
