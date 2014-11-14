package geometry;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesterShape {

	public final static double MinVolumeQuery=40;
	public static void main(String[] args) {
		Shape[] shapeCollection = new Shape[6];
		shapeCollection[0] = new Triangle(11, -7, 3, 1, 2, 300);
		shapeCollection[1] = new Circle(122, -17, 13);
		shapeCollection[2] = new Rectangle(10, -70, 3, 22);
		shapeCollection[3] = new SquarePyramid(1, -7, 3, 5, 1);
		shapeCollection[4] = new Cuboid(1, -7, 3, 11, 20, 30);
		shapeCollection[5] = new Sphere(97, -12, 3, 50);

		
		for (Shape shape : shapeCollection) {
			System.out.println(shape);
		}
		
		String text="\nShapes whose volume is over " + MinVolumeQuery +"\n";
		System.out.println(text);
		
		List<Shape> largeVolumeShapes = Arrays.asList(shapeCollection)
				.stream()
				.filter(s -> s instanceof VolumeMeasurable)
				.filter(v -> ((VolumeMeasurable) v)
				.getVolume() > MinVolumeQuery)
				.collect(Collectors.toList());
			
		for (Shape shape : largeVolumeShapes) {
			System.out.println(shape);
			}
		
		Comparator<Shape> byPerimeter = (s1, s2) -> {
			double perimeterShape1 = ((PerimeterMeasurable)s1).getPerimeter();
			double perimeterShape2 = ((PerimeterMeasurable)s2).getPerimeter();
			return perimeterShape1 < perimeterShape2 ? -1 :
				perimeterShape1 > perimeterShape2 ? 1 : 0;	
			};
		
		System.out.println("\nPlane shapes sorted by their perimeter\n" );
		
		List<Shape> planeShapesByPerimeter = Arrays.asList(shapeCollection)
				.stream()
				.filter(s -> s instanceof PlaneShape)
				.sorted(byPerimeter)
				.collect(Collectors.toList());
		
		for (Shape shape : planeShapesByPerimeter) {
			System.out.println(shape);
		}
	}
}
