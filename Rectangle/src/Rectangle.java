
public class Rectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(1,2);
		System.out.println("Area of Rectangle with width 1 & length 2 = " + r.getArea());
		Cuboid c = new Cuboid(3);
		System.out.println("Volume of Cubois with width 1, length 2 & height 1 = "+c.getVolume());

	}
	double width;
	double length;
	public Rectangle(double width, double length) {
		if(width < 0 ) {
			this.width = 0;
		}
		else
			this.width = width;
		if(length < 0) {
			this .length = 0;
		}
		else
			this.length = length;
	}
	public double getWidth() {
		return this.width;
		
	}
	public double getLength() {
		return this.length;		
	}
	public double getArea() {
		double Area = this.length * this.width;
		return Area;
		
	}



}
