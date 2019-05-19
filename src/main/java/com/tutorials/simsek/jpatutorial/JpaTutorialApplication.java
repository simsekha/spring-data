package com.tutorials.simsek.jpatutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.reposervices.PersonService;
import com.tutorials.simsek.jpatutorial.repository.PersonRepository;
import com.tutorials.simsek.jpatutorial.service.impl.PersonServiceImpl;

@SpringBootApplication
public class JpaTutorialApplication implements CommandLineRunner {
	@Autowired
	PersonServiceImpl repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PersonAddRequest req = new PersonAddRequest();
		req.setId(10L);
		req.setName("hayri");
		repository.saveOrUpdate(req);
	}

}
