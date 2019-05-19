package com.tutorials.simsek.jpatutorial.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.tutorials.simsek.jpatutorial.converter.PersonFromPersonUpdate;
import com.tutorials.simsek.jpatutorial.dto.PersonUpdateRequest;
import com.tutorials.simsek.jpatutorial.dto.PersonUpdateResponse;
import com.tutorials.simsek.jpatutorial.entity.Person;
import com.tutorials.simsek.jpatutorial.repository.PersonRepository;

@Component
public class PersonUpdateCommand extends BaseCommand<PersonUpdateRequest, PersonUpdateResponse, Person> {
	@Autowired
	PersonRepository personRepository;
	
	public PersonUpdateCommand(PersonFromPersonUpdate converter) {
		super(converter);
	}
	
	@Override
	public PersonUpdateResponse perform(PersonUpdateRequest req) {
		PersonUpdateResponse response = new PersonUpdateResponse();		
		Person p = personRepository.save(convert(req));
		return new PersonUpdateResponse();
	}

	@Override
	public PersonUpdateResponse validateRequest(PersonUpdateRequest req) {
		// TODO Auto-generated method stub
		return null;
	}
}
