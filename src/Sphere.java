import java.util.Vector;
import java.awt.Color;
import java.math.*;

public class Sphere extends Object3D {

	public double radiusX;
	public double[] centerArray;

	public Sphere(Color color, double radiusX, double[] centerArray) {
		super(color);
		this.radiusX = radiusX;
		this.centerArray = centerArray;

	}

	public Sphere() {

	}

	public double dotProduct(double[] array1, double[] array2) {

		return (array1[0] * array2[0]) + (array1[1] * array2[1]) + (array1[2] * array2[2]);
	}

	public boolean intersect(Ray ray, Hit hit, double tmin) {

		double t1, t2, t;

		double[] newArray = new double[3];
		for (int i = 0; i < newArray.length; i++) {

			newArray[i] = ray.origin[i] - centerArray[i];
		}

		double a = dotProduct(ray.direction, ray.direction);
		double b = 2 * dotProduct(newArray, ray.direction);
		double c = dotProduct(newArray, newArray) - (radiusX * radiusX);
		double delta = (b * b - (4 * a * c));
		if (delta < 0) {

			return false;
		} else {
			delta = Math.sqrt(delta);
			t1 = (-b - delta) / 2 * a;
			t2 = (-b + delta) / 2 * a;
			if (t1 < t2) {
				t = t1;
			} else {
				t = t2;
			}
			if (t < hit.t) {
				hit.t = t;
				new Hit(t, color);
				return true;
			}

			return false;
		}

	}

}
