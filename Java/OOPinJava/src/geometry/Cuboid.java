package geometry;

public class Cuboid extends SpaceShape {
	private double width;
	private double height;
	private double depth;
	
	public Cuboid(double x, double y, double z,
			double width, double height, double depth) {
		super(x, y, z);
		this.setWidth(width);
		this.setHeight(height);
		this.setDepth(depth);
	}

	@Override
	public double getVolume() {
		double volume= this.width * this.height * this.depth;
		return volume;
	}

	@Override
	public double getArea() {
		double area = (this.width * this.depth +
					this.width * this.height +
					this.height * this.depth);
		return area;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			throw new IllegalArgumentException("Width can not be negative");
		}
		
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			throw new IllegalArgumentException("Height can not be negative");
		}
		
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		if (depth < 0) {
			throw new IllegalArgumentException("Depth can not be negative");
		}
		
		this.depth = depth;
	}

}
