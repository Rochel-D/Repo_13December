package newTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	void test() {
		Reverse a = new Reverse();
		String expected = "dlrowolleH";
		String actual = a.reverse("Helloworld");
		assertEquals(expected, actual);
	}

}
