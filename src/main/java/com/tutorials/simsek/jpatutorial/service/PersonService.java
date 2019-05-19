package com.tutorials.simsek.jpatutorial.service;

import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.dto.PersonAddResponse;
import com.tutorials.simsek.jpatutorial.dto.PersonUpdateRequest;
import com.tutorials.simsek.jpatutorial.dto.PersonUpdateResponse;
import com.tutorials.simsek.jpatutorial.entity.Person;

public interface PersonService extends ReadOnlyService<Person, Long> {
	public PersonAddResponse save(PersonAddRequest request);

	public PersonUpdateResponse update(PersonUpdateRequest request);
}
