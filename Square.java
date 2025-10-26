package lab4;

public class Square {
	Point bottom_left;
	double side_length;
	
	public Square() {
		bottom_left = new Point(0,0);
		side_length = 0;
	}
	
	public Square(Point bottom_left, double side_length) {
		this.bottom_left = bottom_left;
		this.side_length = side_length;
	}
	
	public double perimeter() {
		return 4 * side_length;
	}
	
	public double area() {
		return side_length * side_length;
	}
	
	public boolean isInSquare(Point A) {
		if (A.x>=bottom_left.x && A.x<=bottom_left.x+side_length && A.y>=bottom_left.y && A.y<=bottom_left.y+side_length) {
			return true;
		}
		return false;
	}
}