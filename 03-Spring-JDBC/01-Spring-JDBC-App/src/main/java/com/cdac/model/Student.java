package com.cdac.model;

/** It is Model class bcoz Object creation Responsibility is Taken by Developer and not Spring Container
 *  Purpose of this class is to hold the data which is given by the Developer and Transfer that data
 *  on demand with across the Layer of Application. 
 */

public class Student 
{
	private int rno;
	private String name;
	private double per;
	private String city;
	
	public Student(int rno, String name, double per, String city) 
	{
		this.rno = rno;
		this.name = name;
		this.per = per;
		this.city = city;
	}
	
	public Student() {}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + ", city=" + city + "]";
	}
}
