package geometry;

public abstract class Shape {
	protected Vertex[] vertices; 

	public Shape() {
		super();
		this.vertices=new Vertex[0];
	}

	public Vertex[] getVertices() {
		return vertices;
	}

	public void setVertices(Vertex[] vertices) {
		this.vertices = vertices;
	}

	@Override
	public String toString() {
		
		return this.vertices[0].toString();
	}
	
	protected String getClassName() {
		String fullClassName = this.getClass().toString();
		
		return  fullClassName ;
		}
}
