package newTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void test() {
		int expected = 8;
		add obj = new add();
		int t1=obj.mult(2,2,2);
		
		assertEquals(expected, t1);
	}
	
	@Test
	void test2() {
		int expected = 2;
				add obj = new add();
				
	double t2 = obj.divide(10,5);
	assertEquals(expected, t2);
		
		
	}
	
	@Test
	void test3() {
		int expected = 4;
		add obj=new add();
		
		int t3=obj.add1(2, 2);
		assertEquals(expected, t3);
	}

}
