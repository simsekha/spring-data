package com.tutorials.simsek.jpatutorial.dto;

import com.tutorials.simsek.jpatutorial.entity.Person;

public class PersonUpdateResponse extends BaseResponse{
	private Long id;
	private String name;
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
