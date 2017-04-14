/**
 * 
 */
package com.demo.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.demo.spring.model.Phone;

/**
 * @author superod
 *
 */
@Repository
public class PhoneDAOImpl implements PhoneDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PhoneDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 
	 */
	public PhoneDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public PhoneDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addPhone(Phone p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Phone saved successfully, Phone Details = " + p);
	}

	public void updatePhone(Phone p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Phone updated successfully, Phone Details = " + p);
	}

	public List<Phone> listPhones() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Phone> phonesList = session.createQuery("from Phone").list();
		for (Phone p : phonesList) {
			logger.info("Phone List::" + p);
		}
		return phonesList;
	}

	public Phone getPhoneById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Phone p = (Phone) session.load(Phone.class, new Integer(id));
		logger.info("Phone loaded successfully, Phone details = " + p);
		return p;
	}

	public void removePhone(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Phone p = (Phone) session.load(Phone.class, new Integer(id));
		
		if (null != p) {
			session.delete(p);
		}
		
		logger.info("Phone loaded successfully, Phone details = " + p);
	}

}
