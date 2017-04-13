/**
 * 
 */
package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author superod
 *
 */
@Controller
public class HelloController {

	/**
	 * 
	 */
	public HelloController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/")
	public ModelAndView mainPage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/index")
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}
		
}
