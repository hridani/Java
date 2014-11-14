package geometry;

public abstract class SpaceShape extends Shape implements AreaMeasurable,
		VolumeMeasurable {
	public SpaceShape(double x, double y, double z) {
		super();
		this.vertices = new Vertex3D[1];
		this.vertices[0] = new Vertex3D(x, y, z);
	}

	@Override
	public double getVolume() {
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
				"\nVolume: " + this.getVolume() + "\n" +
				super.toString();
		return result;
	}
}
