package com.tutorials.simsek.jpatutorial.service;

import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.entity.Person;

public interface PersonService extends CRUDService<Person,Long> {
	public Person saveOrUpdate(PersonAddRequest request);
}
