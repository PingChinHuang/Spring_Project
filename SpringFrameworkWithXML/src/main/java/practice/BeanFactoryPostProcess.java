/**
 * 
 */
package practice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author superod
 *
 */
public class BeanFactoryPostProcess implements BeanFactoryPostProcessor {

	/**
	 * 
	 */
	public BeanFactoryPostProcess() {
		// TODO Auto-generated constructor stub
	}

	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("postProcessBeanFactory");
		
	}

}
