package com.tutorials.simsek.jpatutorial.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.entity.Person;

@Component
public class PersonFromPersonAdd implements Converter<PersonAddRequest, Person> {

	@Override
	public Person convert(PersonAddRequest source) {
		Person p = new Person();
		p.setId(source.getId());
		p.setName(source.getName());
		return p;
	}
}
