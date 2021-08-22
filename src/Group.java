import java.awt.Color;
import java.util.ArrayList;

public class Group extends Object3D {

	Sphere[] object3ds;

	public Group(Color color, Sphere[] object3ds) {
		super(color);
		this.object3ds = object3ds;
	}

	public Group(Sphere[] object3ds) {
		super();
		this.object3ds = object3ds;
	}

	@Override

	public boolean intersect(Ray ray, Hit hit, double tmin) {

		boolean flag = false;
		for (int j = 0; j < object3ds.length; j++) {
			if (object3ds[j].intersect(ray, hit, tmin)) {
				hit.color = object3ds[j].color;

				flag = true;
			}

		}
		return flag;
	}
}
