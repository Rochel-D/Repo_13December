package newTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseArrayTest {

	@Test
	@DisplayName("Reversing Array Method")
	void test() {
		ReverseArray a = new ReverseArray();
		int[] arr = {1, 2, 3, 4, 5};
		int[] expected = {5, 4, 3, 2, 1};
		int[] actual = a.reverseArray(arr);
		assertArrayEquals(expected, actual);
	}

}
