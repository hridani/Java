package geometry;

public abstract class PlaneShape extends Shape implements AreaMeasurable,
		PerimeterMeasurable {
  
	public PlaneShape(double x, double y) {
		super();
		this.vertices = new Vertex2D[3];
		this.vertices[0] = new Vertex2D(x, y);
	}

	@Override
	public double getPerimeter() {
		return 0;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public String toString() {
			
		String result="Shape Type: " + this.getClassName() +
				"\nArea: " + this.getArea() +
				"\nPerimeter: " + this.getPerimeter() + "\n" +
				super.toString();
		return result;
	}
}
