package geometry;

public class Sphere extends SpaceShape {
	private static final double ConstVolume=4/3;
	
	private double radius;
	
	public Sphere(double x, double y, double z, double radius) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius < 0) {
			throw new IllegalArgumentException("Radius cannot be negative");
		}
		this.radius = radius;
	}

	@Override
	public double getVolume() {
		double volume=ConstVolume * Math.PI * Math.pow(this.radius, 3);
		return volume;
	}

	@Override
	public double getArea() {
		double area=4.0 * Math.PI * Math.pow(this.radius, 2);
		return area;
	}

}
