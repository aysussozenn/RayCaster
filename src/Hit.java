import java.awt.Color;

public class Hit {
	double t;
	Color color;

	public Hit(double t, Color color) {
		super();
		this.t = t;
		this.color = color;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public Color getColor() {
		return color;
	}

	public Color setColor(Color color) {
		return this.color = color;
	}

}
