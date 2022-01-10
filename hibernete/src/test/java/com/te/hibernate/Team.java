package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	
	private int id;
	private String name;
	private double salary;
	private String designetion;
	


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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignetion() {
		return designetion;
	}

	public void setDesignetion(String designetion) {
		this.designetion = designetion;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", salary=" + salary + ", designetion=" + designetion + "]";
	}

}
