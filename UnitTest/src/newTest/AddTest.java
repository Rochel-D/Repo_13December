package newTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Add objAdd = new Add();
		int expected = 6;
		int actual = objAdd.add(4,2);
		assertEquals(expected, actual);
		
	}

}
