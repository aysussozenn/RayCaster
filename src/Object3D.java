import java.awt.Color;

public abstract class Object3D {
	Color color;


	public Object3D(Color color) {
		super();
		this.color = color;
	}


	public Object3D() {
		// TODO Auto-generated constructor stub
	}


	public abstract boolean intersect(Ray ray , Hit hit , double tmin);
	
	

}
