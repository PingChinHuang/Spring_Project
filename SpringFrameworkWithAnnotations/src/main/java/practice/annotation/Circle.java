/**
 * 
 */
package practice.annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * @author superod
 *
 */
@Component
public class Circle implements Shape {
	private String name;
	private Point center;
	private int radius;

	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Point getCenter() {
		return center;
	}

	//@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	/* (non-Javadoc)
	 * @see practice.annotation.Shape#draw()
	 */
	public void draw() {
		System.out.println("Circle " + name + " center = " + center);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
