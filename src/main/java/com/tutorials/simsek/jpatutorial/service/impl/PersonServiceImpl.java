package com.tutorials.simsek.jpatutorial.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorials.simsek.jpatutorial.command.PersonAddCommand;
import com.tutorials.simsek.jpatutorial.command.PersonUpdateCommand;
import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.dto.PersonAddResponse;
import com.tutorials.simsek.jpatutorial.dto.PersonUpdateRequest;
import com.tutorials.simsek.jpatutorial.dto.PersonUpdateResponse;
import com.tutorials.simsek.jpatutorial.entity.Person;
import com.tutorials.simsek.jpatutorial.repository.PersonRepository;
import com.tutorials.simsek.jpatutorial.service.PersonService;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private PersonAddCommand addCommand;
	@Autowired
	private PersonUpdateCommand updateCommand;

	@Override
	public List<?> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public PersonAddResponse save(PersonAddRequest request) {
		PersonAddResponse response = addCommand.perform(request);
		return response;
	}

	@Override
	public Person getById(Long id) {
		personRepository.getOne(id);
		return null;
	}
	
	@Override
	public PersonUpdateResponse update(PersonUpdateRequest request) {
		PersonUpdateResponse response = updateCommand.perform(request);
		return response;
	}

}
