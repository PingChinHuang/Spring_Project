/**
 * 
 */
package practice;

/**
 * @author superod
 *
 */
public class Triangle {
	
	private int height;
	private String name;
	private Point point1;
	private Point point2;
	private Point point3;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	/**
	 * 
	 */
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("Triangle " + name + " height = " + height);
		System.out.println("Point1: " + point1);
		System.out.println("Point2: " + point2);
		System.out.println("Point3: " + point3);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void init() {
		System.out.println(Triangle.class + " init");
	}
	
	public void destroy() {
		System.out.println(Triangle.class + " destroy");
	}
}
