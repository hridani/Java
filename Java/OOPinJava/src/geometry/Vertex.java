package geometry;

public abstract class Vertex {
		private double x;
		private double y;
	
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		
		public Vertex(double x, double y) {
			setX(x);
			setY(y);
		}
		@Override
		public String toString() {
			return "Vertex [x=" + this.getX() + ", y=" + this.getY() + "]";
		}
		
		public static double getDistanceBetweenPoints(Vertex v1, Vertex v2) {
			double differenceBetweenTwoPoints = Math.pow(v1.getX() - v2.getX() , 2) +
												Math.pow(v1.getY() - v2.getY() , 2);
			
			double distance = Math.sqrt(differenceBetweenTwoPoints);
			return distance;
		}
	}
