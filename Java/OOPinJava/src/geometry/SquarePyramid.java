package geometry;

public class SquarePyramid extends SpaceShape {
	
	private double baseWidth;
	private double height;
		
	public SquarePyramid(double x, double y, double z,
			double baseWidth, double height) {
		super(x, y, z);
		this.setBaseWidth(baseWidth);
		this.setHeight(height);
	}

	@Override
	public double getVolume() {
		double volume =(double)1/3 * this.getBaseArea() * this.height;
		return volume;
	}

	@Override
	public double getArea() {
		double area= this.baseWidth * this.baseWidth;
		return area;
	}

	private double getBaseArea() {
		return this.baseWidth * this.baseWidth;
	}
	
	public double getBaseWidth() {
		return baseWidth;
	}

	public void setBaseWidth(double baseWidth) {
		if (baseWidth < 0) {
			throw new IllegalArgumentException("Base width cannot be negative");
		}
		
		this.baseWidth = baseWidth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			throw new IllegalArgumentException("Height cannot be negative");
		}
		
		this.height = height;
	}
}
