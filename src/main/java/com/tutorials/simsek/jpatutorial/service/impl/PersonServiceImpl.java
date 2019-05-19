package com.tutorials.simsek.jpatutorial.service.impl;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorials.simsek.jpatutorial.converter.PersonConverter;
import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.entity.Person;
import com.tutorials.simsek.jpatutorial.repository.PersonRepository;
import com.tutorials.simsek.jpatutorial.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private PersonConverter converter;

	@Override
	public List<?> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person saveOrUpdate(Person domainObject) {
		personRepository.save(domainObject);
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person saveOrUpdate(PersonAddRequest request) {		
		return saveOrUpdate(converter.convert(request));
	}

}
