package com.sanmina.model;

/**
 * 实体类，用于传递数据给前端
 * @author cat
 *
 */
public class Person {
	
	private String name;
	private Integer age;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person() {
	}
	public Person(String name, Integer age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	

}
