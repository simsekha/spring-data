package com.tutorials.simsek.jpatutorial.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.tutorials.simsek.jpatutorial.converter.PersonFromPersonAdd;
import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.dto.PersonAddResponse;
import com.tutorials.simsek.jpatutorial.entity.Person;
import com.tutorials.simsek.jpatutorial.repository.PersonRepository;

@Component
public class PersonAddCommand extends BaseCommand<PersonAddRequest, PersonAddResponse, Person> {
	@Autowired
	PersonRepository personRepository;

	public PersonAddCommand(PersonFromPersonAdd converter) {
		super(converter);
	}

	@Override
	public PersonAddResponse validateRequest(PersonAddRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonAddResponse perform(PersonAddRequest req) {
		PersonAddResponse response = new PersonAddResponse();
		Person p = personRepository.save(convert(req));
		return new PersonAddResponse();
	}

}
