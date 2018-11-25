package com.techiebirendra.demo.beans;
public class Student {

	private String name;
	private int id;
	private String address;
	private Double fee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public Student(String name, int id, String address, Double fee) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.fee = fee;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
