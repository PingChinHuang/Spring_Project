/**
 * 
 */
package practice.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author superod
 *
 */
public class Application {

	/**
	 * 
	 */
	public Application() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Shape shape = (Shape) context.getBean("triangle");
		shape.draw();

		shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
