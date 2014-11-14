package geometry;

public class Circle extends PlaneShape implements AreaMeasurable,
		PerimeterMeasurable {
	private double radius;
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.setRadius(radius);
	}
	
	@Override
	public double getPerimeter() {
		double perimeter= 2 * Math.PI * this.getRadius();
		return perimeter;
	}
	@Override
	public double getArea() {
		double area= Math.PI * (this.getRadius() * this.getRadius());
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius < 0) {
			throw new IllegalArgumentException("radius cannot be negative");
		}
		this.radius = radius;
	}
	

}
