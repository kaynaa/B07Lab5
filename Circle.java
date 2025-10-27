package lab4;

public class Circle {
	Point center;
	double radius;
	
	public Circle() {
		center = new Point(0, 0);
		radius = 0;
	}
	
	public Circle(Point c, double r) {
		this.center = c;
		this.radius = r;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public boolean isInCircle(Point A) {
		return center.distance(A) < radius;
	}
}