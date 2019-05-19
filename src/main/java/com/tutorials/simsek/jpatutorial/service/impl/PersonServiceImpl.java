package com.tutorials.simsek.jpatutorial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorials.simsek.jpatutorial.command.PersonAddCommand;
import com.tutorials.simsek.jpatutorial.converter.PersonConverter;
import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.dto.PersonAddResponse;
import com.tutorials.simsek.jpatutorial.entity.Person;
import com.tutorials.simsek.jpatutorial.repository.PersonRepository;
import com.tutorials.simsek.jpatutorial.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private PersonConverter converter;
	@Autowired
	private PersonAddCommand addCommand;

	@Override
	public List<?> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person saveOrUpdate(Person domainObject) {

		personRepository.save(domainObject);
		return null;
	}

	@Override
	public Person saveOrUpdate(PersonAddRequest request) {
		PersonAddResponse response = addCommand.perform(request);
		return saveOrUpdate(converter.convert(request));
	}

	@Override
	public Person getById(Long id) {
		personRepository.getOne(id);
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
