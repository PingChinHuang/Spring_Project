/**
 * 
 */
package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.spring.model.Phone;
import com.demo.spring.service.PhoneService;

/**
 * @author superod
 *
 */
@Controller
public class PhoneController {
	
	private PhoneService phoneService;

	/**
	 * 
	 */
	public PhoneController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired(required = true)
	@Qualifier(value = "phoneService")
	public void setPhoneService(PhoneService phoneService) {
		this.phoneService = phoneService;
	}
	
	@RequestMapping(value = "/phones", method = RequestMethod.GET)
	public String listPhones(Model model) {
		model.addAttribute("phone", new Phone());
		model.addAttribute("listPhones", this.phoneService.listPhones());
		return "phone";
	}

	@RequestMapping(value = "/phones/add", method = RequestMethod.POST)
	public String addPhones(@ModelAttribute("phone") Phone p) {
		if (p.getId() == 0) {
			this.phoneService.addPhone(p);
		} else {
			this.phoneService.updatePhone(p);
		}
		
		return "redirect:/phones";
	}
	
	@RequestMapping("/remove/{id}")
	public String removePhone(@PathVariable("id") int id) {
		this.phoneService.removePhone(id);
		return "redirect:/phones";
	}
	
	@RequestMapping("/edit/{id}")	
	public String editPhone(@PathVariable("id") int id, Model model) {
		model.addAttribute("phone", this.phoneService.getPhoneById(id));
		model.addAttribute("listPhones", this.phoneService.listPhones());
		return "phone";
	}
}
