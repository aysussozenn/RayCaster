import java.util.Iterator;
import java.util.Vector;

public class OrtographicCamera {
	double[] centerArray;
	double[] directionArray;
	double[] upArray;
	double size;

	public OrtographicCamera(double[] centerArray, double[] directionArray, double[] upArray, double size) {
		super();
		this.centerArray = centerArray;
		this.directionArray = directionArray;
		this.upArray = upArray;
		this.size = size;
	}

	public double[] generateRay(double x, double y) {

		double[] originArray = new double[3];
		// cross product for finding horizontal
		double[] horizontal = new double[3];
		horizontal[0] = directionArray[1] * upArray[2] - directionArray[2] * upArray[1];
		horizontal[1] = directionArray[2] * upArray[0] - directionArray[0] * upArray[2];
		horizontal[2] = directionArray[0] * upArray[1] - directionArray[1] * upArray[0];

		for (int i = 0; i < originArray.length; i++) {
			originArray[i] = centerArray[i] + (x - 0.5) * size * horizontal[i] + (y - 0.5) * size * upArray[i];

		}

		return originArray;

	}

}
