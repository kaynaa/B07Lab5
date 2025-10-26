package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCircle {

	@Test
	void testInCircleOrigin() {
		Point p = new Point(1, 1);
		Circle c = new Circle(p, 2.0);
		assertTrue(isInCircle(p));
	}
	
	@Test
	void testInCircle() {
		Point p = new Point(1, 1);
		Point p1 = new Point(0,0);
		Circle c = new Circle(p1, 2.0);
		assertTrue(isInCircle(p));
	}
	
	@Test
	void testInCircleBorder() {
		Point p = new Point(2.0, 0);
		Point p1 = new Point(0, 0);
		Circle c = new Circle(p1, 2.0);
		assertFalse(isInCircle(p));
	}

	@Test
	void testInCircleOutside() {
		Point p = new Point(1, 1);
		Point p1 = new Point(10, 99);
		Circle c = new Circle(p, 2.0);
		assertFalse(isInCircle(p1));
	}
	
	@Test
	void testInCircleCloseToBorder() {
		Point p = new Point(1, 1);
		Point p1 = new Point(1, -0.9);
		Circle c = new Circle(p, 2.0);
		assertTrue(isInCircle(p1));
	}
	
	@Test
	void testInCircleIn() {
		Point p = new Point(1, 1);
		Point p1 = new Point(-0.5, -0.1);
		Circle c = new Circle(p, 2.0);
		assertTrue(isInCircle(p1));
	}
	
	
	
	
	
}
