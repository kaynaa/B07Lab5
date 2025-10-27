package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCircle2 {

    private static final double tol = 1e-9;   // tolerance for floating comparison

    @Test
    void testArea1() {
        Circle c = new Circle();
        assertEquals(0, c.area(), tol);
    }

    @Test
    void testArea2() {
        Point p = new Point(9, 5);
        Circle c = new Circle(p, 4);
        double expected = 16 * Math.PI;
        assertEquals(expected, c.area(), tol);
    }

    @Test
    void testArea3() {
        Point p = new Point(3.14, -3.14);
        Circle c = new Circle(p, 1);
        assertEquals(Math.PI, c.area(), tol);
    }

    @Test
    void testArea4() {
        Point p1 = new Point(0, 9.867);
        Point p2 = new Point(6.4539, -8.374);
        Circle c1 = new Circle(p1, 7);
        Circle c2 = new Circle(p2, 7);
        assertEquals(c1.area(), c2.area(), tol);
    }

    @Test
    void testArea5() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Circle c1 = new Circle(p1, 4);
        Circle c2 = new Circle(p2, 4.5);
        assertNotEquals(c1.area(), c2.area(), tol);
    }

    @Test
    void testPerimeter1() {
        Circle c = new Circle();
        assertEquals(0, c.perimeter(), tol);
    }

    @Test
    void testPerimeter2() {
        Point p = new Point(3, 2);
        Circle c = new Circle(p, 5);
        double expected = 10 * Math.PI;
        assertEquals(expected, c.perimeter(), tol);
    }

    @Test
    void testPerimeter3() {
        Point p = new Point(3.14, -3.14);
        Circle c = new Circle(p, 0.5);
        double expected = 2 * Math.PI * 0.5;  
        assertEquals(expected, c.perimeter(), tol);
    }

    @Test
    void testPerimeter4() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(-5.5895, 1.4634);
        Circle c1 = new Circle(p1, 5);
        Circle c2 = new Circle(p2, 5);
        assertEquals(c1.perimeter(), c2.perimeter(), tol);
    }

    @Test
    void testPerimeter5() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Circle c1 = new Circle(p1, 7);
        Circle c2 = new Circle(p2, 7.5);
        assertNotEquals(c1.perimeter(), c2.perimeter(), tol);
    }
}
