package com.jca.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(of= {"id","name","location","birthDate"})
public class Person {
	
	private int id;
	private String name;
	private String location;
	private Date birthDate;
	
	public Person() {}
	
	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
}
