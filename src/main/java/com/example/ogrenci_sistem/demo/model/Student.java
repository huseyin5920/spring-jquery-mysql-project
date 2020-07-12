package com.example.ogrenci_sistem.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private Integer Id;
	private String name;
	private String surname;
	private String number;
	
	public Student() {
	}
	

	public Student(Integer id, String name, String surname, String number) {
		Id = id;
		this.name = name;
		this.surname = surname;
		this.number = number;
	}
	

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNumber() {
		return number;
	}	

	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
