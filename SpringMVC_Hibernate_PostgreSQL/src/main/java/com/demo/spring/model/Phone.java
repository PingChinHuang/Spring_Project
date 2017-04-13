/**
 * 
 */
package com.demo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author superod
 * 
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 */

@Entity
@Table(name = "PHONE")
public class Phone {
	
	@Id // This property is our object id.
	@Column(name = "id") // Map the column, id, in the Phone table.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // This value will be determined by the database.
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "review")
	private String review;

	/**
	 * 
	 */
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Phone [id = " + id + ", name = " + name + ", review = " + review + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Phone other = (Phone) obj;
		if(other.id != id) 
			return false;
		
		return true;
	}
	
	
}
