package com.tutorials.simsek.jpatutorial.command;

import org.springframework.stereotype.Component;

import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.dto.PersonAddResponse;
@Component
public class PersonAddCommand extends BaseCommand<PersonAddRequest,PersonAddResponse> {

	@Override
	public PersonAddResponse perform(PersonAddRequest req) {
		return new PersonAddResponse();
	}

	@Override
	public PersonAddResponse validate(PersonAddRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

}
