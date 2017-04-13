/**
 * 
 */
package com.demo.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.PhoneDAO;
import com.demo.spring.model.Phone;

/**
 * @author superod
 *
 */
@Service
public class PhoneServiceImpl implements PhoneService {
	
	@Autowired
	private PhoneDAO phoneDAO;

	/**
	 * 
	 */
	public PhoneServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public PhoneDAO getPhoneDAO() {
		return phoneDAO;
	}

	public void setPhoneDAO(PhoneDAO phoneDAO) {
		this.phoneDAO = phoneDAO;
	}

	@Transactional
	public void addPhone(Phone p) {
		this.phoneDAO.addPhone(p);
	}

	@Transactional
	public void updatePhone(Phone p) {
		this.phoneDAO.updatePhone(p);
	}

	public List<Phone> listPhones() {
		return this.phoneDAO.listPhones();
	}

	public Phone getPhoneById(int id) {
		return this.phoneDAO.getPhoneById(id);
	}

	public void removePhone(int id) {
		this.phoneDAO.removePhone(id);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
