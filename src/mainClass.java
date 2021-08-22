
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import javax.annotation.processing.RoundEnvironment;
import javax.imageio.ImageIO;
import javax.swing.JFrame;


import org.json.simple.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.awt.*;
import java.awt.image.BufferedImage;

public class mainClass {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ParseException, IndexOutOfBoundsException {

		JSONParser jsonParser = new JSONParser();
		// reading values from json file scene1
		// i assign values to arrays with convertArray function
		Object scene1obj = jsonParser.parse(new FileReader("scene1.json"));
		JSONObject jsonObject = (JSONObject) scene1obj;
		JSONObject orthocamera = (JSONObject) jsonObject.get("orthocamera");
		JSONArray centerArray = (JSONArray) orthocamera.get("center");
		JSONArray directionArray = (JSONArray) orthocamera.get("direction");
		JSONArray upArray = (JSONArray) orthocamera.get("up");
		double size = ((Number) orthocamera.get("size")).doubleValue();

		double[] upArrayDouble = convertArray(upArray);

		double[] centerArrayDouble = convertArray(centerArray);

		double[] directionArrayDouble = convertArray(directionArray);

		JSONObject background = (JSONObject) jsonObject.get("background");
		JSONArray colorBackgroundArray = (JSONArray) background.get("color");

		double[] colorBackgroundArrayDouble = convertArray(colorBackgroundArray);

		JSONArray groupJsonArray = (JSONArray) jsonObject.get("group");
		JSONObject sphereObject = (JSONObject) groupJsonArray.get(0);
		JSONObject sphereJsonObject = (JSONObject) sphereObject.get("sphere");
		JSONArray colorSphereJsonArray = (JSONArray) sphereJsonObject.get("color");
		JSONArray centerSphereJsonArray = (JSONArray) sphereJsonObject.get("center");
		double radiusDouble = ((Number) sphereJsonObject.get("radius")).doubleValue();

		double[] colorSphereArrayDouble = convertArray(colorSphereJsonArray);

		double[] centerSphereArrayDouble = convertArray(centerSphereJsonArray);
//reading values from json file scene2
		Object scene2obj = jsonParser.parse(new FileReader("scene2.json"));
		JSONObject jsonObjectscene2 = (JSONObject) scene2obj;
		JSONObject orthocameraScene2 = (JSONObject) jsonObjectscene2.get("orthocamera");
		JSONArray centerArrayScene2 = (JSONArray) orthocameraScene2.get("center");
		JSONArray directionArrayScene2 = (JSONArray) orthocameraScene2.get("direction");
		JSONArray upArrayScene2 = (JSONArray) orthocameraScene2.get("up");

		double sizeScene2 = ((Number) orthocameraScene2.get("size")).doubleValue();

		double[] upArrayScene2ArrayDouble = convertArray(upArrayScene2);

		double[] centerArrayScene2Double = convertArray(centerArrayScene2);

		double[] directionArrayScene2Double = convertArray(directionArrayScene2);

		JSONObject backgroundScene2 = (JSONObject) jsonObjectscene2.get("background");
		JSONArray colorBackgroundArrayScene2 = (JSONArray) backgroundScene2.get("color");

		double[] colorBackgroundArrayScene2Double = convertArray(colorBackgroundArrayScene2);

		JSONArray groupJsonArrayScene2 = (JSONArray) jsonObjectscene2.get("group");
		JSONObject sphereObjectScene2 = (JSONObject) groupJsonArrayScene2.get(0);
		JSONObject sphereJsonObjectScene2 = (JSONObject) sphereObjectScene2.get("sphere");
		JSONArray colorSphereJsonArrayScene2 = (JSONArray) sphereJsonObjectScene2.get("color");
		JSONArray centerSphereJsonArrayScene2 = (JSONArray) sphereJsonObjectScene2.get("center");
		double radiusScene2 = ((Number) sphereJsonObjectScene2.get("radius")).doubleValue();

		double[] colorSphereArrayScene2Double = convertArray(colorSphereJsonArrayScene2);

		double[] centerSphereScene2ArrayDouble = convertArray(centerSphereJsonArrayScene2);
		// sphere2
		JSONObject sphereObjectScene2Sphere2 = (JSONObject) groupJsonArrayScene2.get(1);
		JSONObject sphereJsonObjectScene2Sphere2 = (JSONObject) sphereObjectScene2Sphere2.get("sphere");
		JSONArray colorSphereJsonArrayScene2Sphere2 = (JSONArray) sphereJsonObjectScene2Sphere2.get("color");
		JSONArray centerSphereJsonArrayScene2Sphere2 = (JSONArray) sphereJsonObjectScene2Sphere2.get("center");
		double radiusScene2Sphere2 = ((Number) sphereJsonObjectScene2Sphere2.get("radius")).doubleValue();

		double[] colorSphere2Scene2ArrayDouble = convertArray(colorSphereJsonArrayScene2Sphere2);

		double[] centerSphere2Scene2ArrayDouble = convertArray(centerSphereJsonArrayScene2Sphere2);

		// sphere3
		JSONObject sphereObjectScene2Sphere3 = (JSONObject) groupJsonArrayScene2.get(2);
		JSONObject sphereJsonObjectScene2Sphere3 = (JSONObject) sphereObjectScene2Sphere3.get("sphere");
		JSONArray colorSphereJsonArrayScene2Sphere3 = (JSONArray) sphereJsonObjectScene2Sphere3.get("color");
		JSONArray centerSphereJsonArrayScene2Sphere3 = (JSONArray) sphereJsonObjectScene2Sphere3.get("center");
		double radiusScene2Sphere3 = ((Number) sphereJsonObjectScene2Sphere3.get("radius")).doubleValue();

		double[] colorSphere3Scene2ArrayDouble = convertArray(colorSphereJsonArrayScene2Sphere3);

		double[] centerSphere3Scene2ArrayDouble = convertArray(centerSphereJsonArrayScene2Sphere3);

		// sphere4
		JSONObject sphereObjectScene2Sphere4 = (JSONObject) groupJsonArrayScene2.get(3);
		JSONObject sphereJsonObjectScene2Sphere4 = (JSONObject) sphereObjectScene2Sphere4.get("sphere");
		JSONArray colorSphereJsonArrayScene2Sphere4 = (JSONArray) sphereJsonObjectScene2Sphere4.get("color");
		JSONArray centerSphereJsonArrayScene2Sphere4 = (JSONArray) sphereJsonObjectScene2Sphere4.get("center");
		double radiusScene2Sphere4 = ((Number) sphereJsonObjectScene2Sphere4.get("radius")).doubleValue();

		double[] colorSphere4Scene2ArrayDouble = convertArray(colorSphereJsonArrayScene2Sphere4);

		double[] centerSphere4Scene2ArrayDouble = convertArray(centerSphereJsonArrayScene2Sphere4);

		// sphere5
		JSONObject sphereObjectScene2Sphere5 = (JSONObject) groupJsonArrayScene2.get(4);

		JSONObject sphereJsonObjectScene2Sphere5 = (JSONObject) sphereObjectScene2Sphere5.get("sphere");
		JSONArray colorSphereJsonArrayScene2Sphere5 = (JSONArray) sphereJsonObjectScene2Sphere5.get("color");
		JSONArray centerSphereJsonArrayScene2Sphere5 = (JSONArray) sphereJsonObjectScene2Sphere5.get("center");
		double radiusScene2Sphere5 = ((Number) sphereJsonObjectScene2Sphere5.get("radius")).doubleValue();

		double[] colorSphere5Scene2ArrayDouble = convertArray(colorSphereJsonArrayScene2Sphere5);

		double[] centerSphere5Scene2ArrayDouble = convertArray(centerSphereJsonArrayScene2Sphere5);

		// Creating objects for scene1
		Color sphereColor = new Color((int) colorSphereArrayDouble[0], (int) colorSphereArrayDouble[1],
				(int) colorSphereArrayDouble[2]);

		Sphere sphere = new Sphere(sphereColor, radiusDouble, centerSphereArrayDouble);

		OrtographicCamera camera = new OrtographicCamera(centerArrayDouble, directionArrayDouble, upArrayDouble, size);

		Color backgroundColor = new Color((int) colorBackgroundArrayDouble[0], (int) colorBackgroundArrayDouble[1],
				(int) colorBackgroundArrayDouble[2]);

		/// Creating objects for scene2
		Color sphere1Color = new Color((int) colorSphereArrayScene2Double[0], (int) colorSphereArrayScene2Double[1],
				(int) colorSphereArrayScene2Double[2]);
		Color sphere2Color = new Color((int) colorSphere2Scene2ArrayDouble[0], (int) colorSphere2Scene2ArrayDouble[1],
				(int) colorSphere2Scene2ArrayDouble[2]);
		Color sphere3Color = new Color((int) colorSphere3Scene2ArrayDouble[0], (int) colorSphere3Scene2ArrayDouble[1],
				(int) colorSphere3Scene2ArrayDouble[2]);
		Color sphere4Color = new Color((int) colorSphere4Scene2ArrayDouble[0], (int) colorSphere4Scene2ArrayDouble[1],
				(int) colorSphere4Scene2ArrayDouble[2]);
		Color sphere5Color = new Color((int) colorSphere5Scene2ArrayDouble[0], (int) colorSphere5Scene2ArrayDouble[1],
				(int) colorSphere5Scene2ArrayDouble[2]);

		Sphere sphere1 = new Sphere(sphere1Color, radiusScene2, centerSphereScene2ArrayDouble);
		Sphere sphere2 = new Sphere(sphere2Color, radiusScene2Sphere2, centerSphere2Scene2ArrayDouble);
		Sphere sphere3 = new Sphere(sphere3Color, radiusScene2Sphere3, centerSphere3Scene2ArrayDouble);
		Sphere sphere4 = new Sphere(sphere4Color, radiusScene2Sphere4, centerSphere4Scene2ArrayDouble);
		Sphere sphere5 = new Sphere(sphere5Color, radiusScene2Sphere5, centerSphere5Scene2ArrayDouble);
		Sphere[] objectsGroup = new Sphere[5];
		objectsGroup[0] = sphere1;
		objectsGroup[1] = sphere2;
		objectsGroup[2] = sphere3;
		objectsGroup[3] = sphere4;
		objectsGroup[4] = sphere5;

		Group group = new Group(objectsGroup);

		int width = 500, height = 500;
		double far1 = 11.5;
		double near1 = 8;

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		BufferedImage imageDepth = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		BufferedImage image1 = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		BufferedImage imageDepth1 = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics2d, graphics2dDepth;
		graphics2d = image1.createGraphics();
		graphics2d.setColor(Color.BLACK);
		graphics2d.fillRect(0, 0, width, height);
		graphics2dDepth = imageDepth1.createGraphics();
		graphics2dDepth.setColor(Color.BLACK);
		graphics2dDepth.fillRect(0, 0, width, height);
		double[] origin = new double[3];
		float near = 9, far = 11;
		for (int a = 0; a < height; a++) {
			for (int j = 0; j < width; j++) {

				origin = camera.generateRay((double) a / height, (double) j / width);
				Ray ray = new Ray(origin, directionArrayScene2Double);
				Hit hit = new Hit(1000000, backgroundColor);

				if (group.intersect(ray, hit, 0.01)) {
					image1.setRGB(a, width - j - 1, hit.color.getRGB());
					float depth = (float) ((float) far1 - hit.t) / ((float) far1 - (float) near1);

					Color depthColor = new Color(depth, depth, depth);
					imageDepth1.setRGB(height - a - 1, j, depthColor.getRGB());

				}

			}
		}
		for (int a = 0; a < height; a++) {
			for (int j = 0; j < width; j++) {

				origin = camera.generateRay((double) a / height, (double) j / width);
				Ray ray = new Ray(origin, directionArrayDouble);
				Hit hit = new Hit(1000000, sphereColor);
				image.setRGB(a, j, backgroundColor.getRGB());
				imageDepth.setRGB(a, j, backgroundColor.getRGB());
				if (sphere.intersect(ray, hit, 0.01)) {
					image.setRGB(a, j, sphereColor.getRGB());
					float depth = (float) (far - hit.t) / (far - near);
					Color depthColor = new Color(depth, depth, depth);
					imageDepth.setRGB(a, j, depthColor.getRGB());
				}

			}
		}

		File output = new File("scene1.png");
		ImageIO.write(image, "png", output);

		File outputDepth = new File("scene1_depth.png");
		ImageIO.write(imageDepth, "png", outputDepth);

		File output1 = new File("scene2.png");
		ImageIO.write(image1, "png", output1);

		File outputDepth1 = new File("scene2_depth.png");
		ImageIO.write(imageDepth1, "png", outputDepth1);

	}

	// necessary functions for convert json values to arrays
	public static double[] convertArray(JSONArray jsonArray) {
		Object[] array = convertToObjectArray(jsonArray);
		double[] arrayDouble = new double[array.length];
		arrayDouble = convertObjectToDouble(array);
		return arrayDouble;
	}

	public static Object[] convertToObjectArray(JSONArray jsonArray) {
		Object[] array = new Object[jsonArray.size()];
		array = jsonArray.toArray();
		return array;
	}

	public static double[] convertObjectToDouble(Object[] array) {

		String String_Array[] = new String[array.length];
		double[] doubleArray = new double[String_Array.length];

		for (int i = 0; i < String_Array.length; i++) {
			String_Array[i] = array[i].toString();
		}

		for (int i = 0; i < String_Array.length; i++) {
			doubleArray[i] = Double.parseDouble(String_Array[i]);
		}
		return doubleArray;

	}

}
