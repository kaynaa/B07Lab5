package lab4;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSquare {

	@Test
	void testPerimeter1() {
		Square s = new Square();
		assertEquals(s.perimeter(), 0);
	}
	
	@Test
	void testPerimeter2() {
		Point p = new Point(3, 2);
		Square s = new Square(p, 5);
		assertEquals(s.perimeter(), 20);
	}
	
	@Test
	void testPerimeter3() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3.1249, -1.3334);
		Square s1 = new Square(p1, 7);
		Square s2 = new Square(p2, 7);
		assertEquals(s1.perimeter(), s2.perimeter());
	}
	
	@Test
	void testPerimeter4() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 0);
		Square s1 = new Square(p1, 5);
		Square s2 = new Square(p2, 5.5);
		assertNotEquals(s1.perimeter(), s2.perimeter());
	}
	
	@Test
	void testArea1() {
		Square s = new Square();
		assertEquals(s.area(), 0);
	}
	
	@Test
	void testArea2() {
		Point p = new Point(3, 2);
		Square s = new Square(p, 5);
		assertEquals(s.area(), 25);
	}
	
	@Test
	void testArea3() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3.1249, -1.3334);
		Square s1 = new Square(p1, 7);
		Square s2 = new Square(p2, 7);
		assertEquals(s1.area(), s2.area());
	}
	
	@Test
	void testArea4() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 0);
		Square s1 = new Square(p1, 5);
		Square s2 = new Square(p2, 5.5);
		assertNotEquals(s1.area(), s2.area());
	}
	
	@Test
	void testIsInSquare1() {
		Square s = new Square();
		Point test = new Point(0, 0);
		assertTrue(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare2() {
		Square s = new Square();
		Point test = new Point(-0.1, 0.1);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare3() {
		Square s = new Square();
		Point test = new Point(0.1, 0.1);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare4() {
		Square s = new Square();
		Point test = new Point(0.1, -0.1);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare5() {
		Square s = new Square();
		Point test = new Point(-0.1, -0.1);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare6() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3187.9999, 133);
		assertTrue(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare7() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3170, 149.1234);
		assertTrue(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare8() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3187.9999, 163);
		assertTrue(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare9() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3200, 149.1234);
		assertTrue(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare10() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3193.9823, 161.8764);
		assertTrue(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare11() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3169.98, 150);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare12() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3184, 132.87);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare13() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3176, 163.9);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare14() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3200.34, 160);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare15() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3169.98, 132.7);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare16() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3169.98, 163.2);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare17() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3200.2, 132.5);
		assertFalse(s.isInSquare(test));
	}
	
	@Test
	void testIsInSquare18() {
		Point p = new Point(3170, 133);
		Square s = new Square(p, 30);
		Point test = new Point(3200.2, 163.5);
		assertFalse(s.isInSquare(test));
	}
}
