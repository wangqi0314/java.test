package sh.basic_data_type;

import org.junit.Test;

public class CharacterTest {

	@Test
	public void charTest() {
		char ch = 'a';
		char uniChar = '\u039A';
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

		System.out.println(ch);
		System.out.println(uniChar);
		System.out.println(charArray);
	}

	@Test
	public void characterTest() {
		Character ch = new Character('a');
		System.out.println(ch);

		char cch = ch;
		System.out.println(cch);
	}

	@Test
	public void transferTest() {
		System.out.println("She said \"Hello!\" to me.");
	}
}
