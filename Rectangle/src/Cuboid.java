
public class Cuboid extends Rectangle {
	double height;
	public Cuboid(double height) {
		super(1,2);
		if(height < 0) {
			this.height = 0;
		}
		else
			this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		double Volume = this.getArea() * this.height;
		return Volume;
	}

}
