package geometry;

public class Rectangle extends PlaneShape implements AreaMeasurable,
		PerimeterMeasurable {
	
	private double width;
	private double height;
	
	public Rectangle(double x, double y, double width, double height) {
		super(x,y);
		this.setHeight(height);
		this.setWidth(width);
	}

	@Override
	public double getPerimeter() {
		
		double perimeter= (2 * this.width) + (2 * this.height);
		return perimeter;
	}

	@Override
	public double getArea() {
		double area = this.width * this.height;
		return area;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			throw new IllegalArgumentException("width cannot be negative");
		}
		
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			throw new IllegalArgumentException("width cannot be negative");
		}
		
		this.height = height;
	}
}
