package com.tutorials.simsek.jpatutorial.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.tutorials.simsek.jpatutorial.dto.PersonUpdateRequest;
import com.tutorials.simsek.jpatutorial.entity.Person;

@Component
public class PersonFromPersonUpdate implements Converter<PersonUpdateRequest, Person> {

	@Override
	public Person convert(PersonUpdateRequest source) {
		Person p = new Person();
		p.setId(source.getId());
		p.setName(source.getName());
		return p;
	}

}
