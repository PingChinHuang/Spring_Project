/**
 * 
 */
package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.model.Phone;

/**
 * @author superod
 *
 */
public interface PhoneDAO {

	public void addPhone(Phone p);
	public void updatePhone(Phone p);
	public List<Phone> listPhones();
	public Phone getPhoneById(int id);
	public void removePhone(int id);

}
